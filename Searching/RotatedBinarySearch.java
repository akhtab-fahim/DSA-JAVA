
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedBinarySearch {
    static int search(int arr[],int target){
        int pivot = findPivot(arr);
        if(findPivot(arr)==-1){
            return binarySearch(arr, target,0,arr.length-1);
        }
        if(arr[pivot]==target) {return pivot;}
        if(target>=arr[0]){
            return binarySearch(arr, target, 0, pivot-1);
        }else{
            return binarySearch(arr, target, pivot+1, arr.length-1);
        }
    }
    static int binarySearch(int arr[],int target,int start,int end){
        int middle = Integer.MIN_VALUE;
        while(end>=start){
            middle = (start + end )/2;
            if(arr[middle]==target) { return middle;}
            else if(arr[middle]<target) {start = middle +1;}
            else if(arr[middle]>target){end = middle-1;}
        }
        return -1;
    }
    static int findPivot(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            
            // Check for pivot conditions with boundary checks
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            
            // Adjust search space based on the rotation
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        
    }
}
