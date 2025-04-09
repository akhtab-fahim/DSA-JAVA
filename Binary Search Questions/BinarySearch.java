import java.security.interfaces.RSAPrivateCrtKey;
import java.util.ArrayList;

public class BinarySearch {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    private int binarySearch(int arr[],int low,int high,int target){
        int mid;
        mid = (high + low)/2;

        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] > target){
            return binarySearch(arr, low, mid - 1, target);
        }else{
            return binarySearch(arr, mid + 1, high, target);
        }
        
        return -1;

    }

    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int floor = findFloor(arr,x);
        int ceil = findCeil(arr,x);
        return new int[]{floor,ceil};
        
    }
    private int findCeil(int[] arr, int x) {
        // write code here
        int low = 0,high = arr.length -1;
        int ans = -1;
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid] >= x){
                ans = arr[mid];
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        
        return ans;
        
    }
    private int findFloor(int[] arr, int x) {
        // write code here
        int low = 0,high = arr.length -1;
        int ans = -1;
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid] <= x){
                ans = arr[mid];
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        
        return ans;
        
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{binarySearch(nums, target, true),binarySearch(nums, target, false)};
        
    }
    private int binarySearch(int [] arr,int target,boolean firstOccurence){
        int low = 0,high = arr.length-1,mid;
        int ans = -1;
        while(low<=high){
            mid = (high + low)/2;
            if(arr[mid] == target){
                ans = mid;
                if(firstOccurence){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }


    public int singleNonDuplicate(int[] nums) {
        int low = 1, high = nums.length - 2, mid;
        if(nums.length == 1) return nums[0];
        while (low <= high) {
            mid = low + (high - low) / 2;
            if(nums[0]!=nums[1]) return nums[0];
            if(nums[nums.length - 1]!=nums[nums.length - 2]) return nums[nums.length - 1];
            if(nums[mid-1]!=nums[mid] && nums[mid+1] != nums[mid] ) return nums[mid];
            if(mid%2!=0){
                if(nums[mid-1]==nums[mid]){ // im in the right of single element i would go right
                    low = mid +1;
                }else{
                    high = mid -1;
                }
            }else{
                 if(nums[mid-1]==nums[mid]){ 
                    high = mid -1;
                }else{
                    low = mid +1;
                }
            }
        }
        return -1;
    }


    public int findPeakElement(int[] nums) {
        int low = 1, high = nums.length - 2, mid;
        if(nums.length == 1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        while (low <= high) {
            mid = (high + low) / 2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            if(nums[mid]>nums[mid-1]){
                low = mid + 1;
            }else{
                high = mid -1;
            }
            
        }
        return -1;
    }

    public int nthRoot(int n, int m) {
        // code here
        int low = 1,high = m,mid;
        while(low<=high){
            mid = (high + low)/2;
            if(mult(mid,n,m) == 1) return mid;
            if(mult(mid,n,m)==2)   high = mid -1;
            else low = mid +1;
        }
        return -1;
    }
    private int mult(int num,int n,int m){
        long ans = 1;
        for(int i = 1;i<=n;i++){
            ans = ans * num;
            if(ans>m) return 2;
        }
        if(ans == m) return 1;
        return 0;
    }

    
    public int findMin(int[] nums) {
        int low = 0,high = nums.length -1,mid;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            mid = (high + low )/2;
            if(nums[low]<=nums[high]){
               if(nums[low]<=ans){
                    ans = nums[low];
                }
                break; 
            }

            if(nums[low]<=nums[mid]){ //left sorted
                if(nums[low]<=ans){
                    ans = nums[low];
                }
                low = mid + 1;
            }else{
                if(nums[mid]<=ans){
                    ans = nums[mid];
                }
                high = mid - 1;
            }
        }
        return ans;
    }

    public int minDays(int[] day, int m, int k) {
        int min = day[0],max = 0;
        for(int i : day){
            if(max<i)   max = i;
            if(min>i)   min = i;
        }
        int low = min,high= max,mid,ans = -1;
        while(low<=high){
            mid = (low+high)/2;
            if(makeBouqet(day, mid, m, k) >= m){
                ans = mid;
                high = low -1;
            }

            if(makeBouqet(day, mid, m, k) < m){
                low = mid + 1;
            }
        }
        return ans;
    }

    private int makeBouqet(int days[],int f,int m,int k){
        int count = 0,bokeh = 0;
        for(int i = 0;i<days.length;i++){
            if(f<days[i]){
                bokeh = bokeh + count/k;
                count = 0;
            }else{
                count++;
            }
        }

        return bokeh;
    }



    public int shipWithinDays(int[] weights, int days) {
        int total = 0;
        for(int i : weights){
            total = total + i;
        }
        int low = 1,high = total,mid,ans=0;
        while(low<=high){
            mid = (high + low )/2;
            if(countDays(weights,mid)<=days){
                ans = mid;
                high= mid -1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    private int countDays(int weights[],int n){
        int sum = 0,days = 0;
        for(int i = 0;i<weights.length;i++){
            if (sum + weights[i] > n) {
                days++;
                sum = weights[i];
            } else {
                sum += weights[i];
            }
        }
        return days;
    }

    public int findKthPositive(int[] arr, int k) {
        int low = 0,high = arr.length - 1,mid;
        int missing;
        while(low<=high){
            mid = (low + high )/2;
            missing = arr[mid] - (mid + 1);
            if(missing<k)   low = mid + 1;
            else high = mid - 1;
        }

        return k + high + 1;
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        int max = 0,sum = 0;
        for(int i : arr){
            if(i>max) max = i;
            sum+=i;
        }
        
        if (m > n) return -1;

        int low = max,high = sum,mid,ans = -1;
        while(low<=high){
            mid = (high + low)/2;
            if(getStudents(arr, mid)<=m){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }
        return ans;
        
    }

    private static int getStudents(ArrayList<Integer> arr,int maxCapacity){
        int pages = 0,students = 1;
        for(int i : arr){
            if(pages + i > maxCapacity){
                pages = i;
                students ++;
            }else{
                pages += i;
            }
        }
        return students;
    }


    public int splitArray(int[] arr, int k) {
        int max = 0,sum = 0;
        for(int i : arr){
            if(i>max) max = i;
            sum+=i;
        }
        
        int low = max,high = sum,mid,ans = -1;
        while(low<=high){
            mid = (high + low)/2;
            if(getPartitions(arr, mid)<=k){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }
        return ans;
    }

    private static int getPartitions(int[] arr,int maxCapacity){
        int sum = 0,divisions = 1;
        for(int i : arr){
            if(sum + i > maxCapacity){
                sum = i;
                divisions ++;
            }else{
                sum += i;
            }
        }
        return divisions;
    }

    public static double MinimiseMaxDistance(int[] arr, int K) {
        int n = arr.length;
        double low = 0;
        double high = 0;
    
        for (int i = 0; i < n - 1; i++) {
            high = Math.max(arr[i + 1] - arr[i], high);
        }
    
        while (high - low > 1e-6) {
            double mid = (low + high) / 2.0;
            int count = numberOfGasStations(mid, arr);
            if (count > K) {
                low = mid;
            } else {
                high = mid;
            }
        }
    
        return high;
    }
    
    private static int numberOfGasStations(double dist, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            double gap = arr[i + 1] - arr[i];
            count += (int) (gap / dist);
        }
        return count;
    }
}
