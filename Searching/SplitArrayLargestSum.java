//Leetcode Hard Google
//https://leetcode.com/problems/split-array-largest-sum/description/
public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int arr[] = {7,2,5,10,8};
        System.out.println(splitArray(arr,2));
    }
    static int splitArray(int[] arr, int k) {
        int start =0;
        int end = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);  //start contains the largest elemnt in the array
            end+=arr[i]; //end contains sum of the array
        }
        //binary search
        while(start<end){
             int mid = (start+end)/2;
             //calc how many pieces in which we can divide that arr 
             int sum =0;
             int pieces =1;
             for(int x : arr){
                if(sum + x >mid){
                    sum = x;
                    pieces++;
                }else{
                    sum += x;
                }
             }
             if(pieces > k ){
                start = mid+1;
             }else{
                end = mid;
             }
        }
       return start;
    }
}
