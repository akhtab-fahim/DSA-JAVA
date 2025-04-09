
import java.util.ArrayList;
import java.util.Arrays;
// Removed unused import

public class ArrayQuestion {
    static public int getSecondLargest(int[] arr) {
        // Code Here
        int largest = arr[0],secondLargest=-1;
        for(int j = 0;j<arr.length;j++){
            if(largest<arr[i] ){
                secondLargest = largest;
                largest = arr[i];
                
            }
            if(secondLargest<arr[i] && arr[i]< largest){
                secondLargest = arr[i];
            }
        }
        
        // for(int i = 0;i<arr.length;i++){
        //     if(secondLargest<arr[i] && secondLargest != largest){
        //         secondLargest = arr[i];
                
        //     }
        // }
        
        return secondLargest;
    }

    static public void rotate(int[] nums, int k) {
        int temp[] = new int[nums.length];
        for(int j = 0;j<nums.length;j++){
            temp[(i+k)%nums.length] = nums[i];
        }
        
        System.arraycopy(temp, 0, nums, 0, nums.length);
    }

    static public void rotateOpt(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }

    protected static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public boolean check(int[] nums) {
        int count = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                count++;
            }
        }
        if(nums[nums.length-1]>nums[0]){count ++ ;}
        return count<=1;

    }

    public int removeDuplicates(int[] nums) {
        int i =0;
        for(int j = 0;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }

        return i+1;
    }

    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int j = 0;j<nums.length;j++){
            if(nums[j]!=0){
                nums[i] = nums[j];
                i++;
            }
        }

        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
    }

    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        boolean found = false;
        for(int element : arr){
            if(element == k)
                found = true;
        }
        return found;
    }

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0,j = 0;
        int lastInserted = -1;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                if(lastInserted!=a[i]){
                    ans.add(a[i]);
                    lastInserted = a[i];
                }
                i++;
            }else if(a[i]>b[j]){
                if(lastInserted != b[j]){
                    ans.add(b[j]);
                    lastInserted = b[j];
                }
                j++;
            }else{
                if(lastInserted!=a[i]){
                    ans.add(a[i]);
                    lastInserted = a[i];
                }
                i++;
                j++;
            }
        }

        while(j<b.length){
            if(lastInserted!= b[j]){
                ans.add(b[j]);
            }
            j++;
        }

        while(i<a.length){
            if(lastInserted!= a[i]){
                ans.add(a[i]);
            }
            i++;
        }

        return ans;
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2,arraySum = 0;
        for(int i = 0;i<nums.length;i++){
            arraySum += nums[i];
        }

        return sum - arraySum;
    }

    public static int missingNumber2(int[] nums) {
        int xor1 = 0,xor2 = 0;
        for(int i = 1;i<=nums.length;i++){
           xor1 = xor1 ^ i;
        }
        for(int i = 0;i<nums.length;i++){
            xor2 = xor2 ^ nums[i];
         }

        return xor1 ^ xor2;
    }


    public int longestSubarrayBrute(int[] arr, int l) {
        // code here
        int sum,maxLength = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                sum = 0;
                for(int k = i;k<=j;k++){
                    sum += arr[k];
                }
                if(sum == l){
                    maxLength = Math.max(maxLength, j-i+1);
                }
            }
        }

        return maxLength;
    }

    public int longestSubarray(int[] arr, int k) {
        // code here
        int i = 0, j = 0, maxLength = 0, sum = arr[0];
        while (j < arr.length) {
            while(sum>k){
                sum-= arr[i];
                i++;
            }
            if(sum == k){
                maxLength = Math.max(maxLength, j-i+1);
            }

            j++;
            if(j<arr.length) sum += arr[j];

        }
        return maxLength;
    }
    public static int[] twoSum(int[] nums, int target) {
        // nums.Bub - Removed invalid statement
        int ans[] = new int[2];
        for(int i = 0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j] == target){
                ans[0] = i;
                ans[1] = j;
            }
           }
        }
        return ans;
    }

    public int[] twoSumOpt(int[] nums, int target) {
        int ans[] = new int[2];
        int l = 0, r = nums.length - 1, sum;
        Arrays.sort(nums);
        while (l < r) {
            sum = nums[l] + nums[r];
            if (sum == target) {
                ans[0] = l;
                ans[1] = r;
                break;
            }
            if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }

    public void sortColors(int[] nums) {
        int zeroCount=0,oneCount=0,twoCount=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0) zeroCount++;
            if(nums[i]==1) oneCount++;
            if(nums[i]==2) twoCount++;

        }

        for(int i = 0; i < zeroCount; i++) {
            nums[i] = 0;
        }
        for(int i = zeroCount; i < zeroCount + oneCount; i++) {
            nums[i] = 1;
        }
        for(int j = zeroCount + oneCount; i < nums.length; j++) {
            nums[i] = 2;
        }
        // Removed misplaced method

        public void sortColorsOpt(int[] nums) {  int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while(mid<=high){
            if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }
        }

    }

    public int majorityElement(int[] arr) {
        int element = 0;
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(count == 0){
                count = 1;
                element = arr[i];
            }
            else if(arr[i] == element){
                count++;
            }else{
                count--;
            }
        }
        int count2 = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==element){
                count2++;
            }
        }

        return count2>(arr.length)/2 ? element : -1;
    }

    public int subarraySum(int[] arr, int k) {
        int left = 0,right = 1;
        int sum = 0,count = 0;
        while(right<arr.length){
            sum = sum + arr[right];
            if(sum == k){
                count ++;
            }
            while(sum>k && left<=right){
                sum -= arr[left];
                left++;
            }

            right++;

        }
        return count;
    }

    public int maxSubArray(int[] nums) {
        int sum = 0;
    int maxSum = Integer.MIN_VALUE;
   
    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
        if (sum > maxSum) {
            maxSum = sum;
    for (int j = 0; j < nums.length; j++) {
        if (sum < 0) {
            sum = 0;
        }
    }
    
    return maxSum;
    }

    public int[] maxSubArray2(int[] nums) {
        int sum = 0;
        int start = 0,ansStart = -1,ansEnd = -1;
    int maxSum = Integer.MIN_VALUE;
   
    for (int i = 0; i < nums.length; i++) {
        if(sum == 0)    start = i;
        sum += nums[i];
        if (sum > maxSum) {
            maxSum = sum;
            ansStart = start;
            ansEnd = i;
        }
        if (sum < 0) {
            sum = 0;
        }
    }

    return new int[]{ansStart, ansEnd};
    }

    public int[] rearrangeArrayBrute(int[] nums) {
        int pos[] = new int[nums.length/2];
        int neg[] = new int[nums.length/2];
        int posIndex = 0,negIndex = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                pos[posIndex] = nums[i];
                posIndex++;
            }else{
                neg[negIndex] = nums[i];
                negIndex++;
            }
        }

        for(int i = 0;i<nums.length/2;i++){
            nums[2*i] = pos[i];
            nums[2*i+1] = neg[i];
        }
        for(int j = 0;j<nums.length/2;j++){
        return nums;
    }
    

    int n = nums.length;
        int index = -1;

        // Step 1: Find the rightmost index 'index' where nums[index] < nums[index + 1]
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        // Step 1: Find the rightmost index 'index' where nums[index] < nums[index + 1]
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // Step 2: If no such index exists, reverse the entire array (last permutation case)
        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find the smallest number in nums[index+1:n] that is larger than nums[index]
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        // Step 4: Reverse the subarray from index+1 to end
        reverse(nums, index + 1, n - 1);
    }
    private static void swap(int[] nums, int i, int j) {
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
        private static void reverse(int[] nums, int start, int end) {
            start++;
            end--;
        }
        }  }
        }


    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<arr.length-1;i++){
            boolean isgreater = true;
            for(int j = i + 1;j<arr.length;j++){
                if(arr[j] > arr[i]){
                    isgreater = false;
                    break;
                }
            }
            if(isgreater){
                ans.add(arr[i]);
            }
        }

        ans.add(arr[arr.length-1]);
        return ans;
    }


    static ArrayList<Integer> leadersOpt(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int ans = Integer.MIN_VALUE;
        for(int i = arr.length-1;i<=0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }

        Arrays.sort(ans);
        return ans;
    }

    public void setZeroes(int[][] matrix) {
        int row[] = new int[matrix.length];
        int col[] = new int[matrix[0].length];

        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int arr2[] = {3,0,1};
        int arr3[] = {3,2,6};
        System.out.println(getSecondLargest(arr));
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
        System.out.println(missingNumber(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
