public class InfiniteArray {
    static int asnwer(int arr[],int target){
        int start =0;
        int end =1; //staring with a box of size two  
        while(target>arr[end]){
            int newstart =end; //start value gonna be change
            end=end + (end-start+1) *2;
            start=newstart;
        }
            return binarySearch(arr, target, start, end);
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
    public static void main(String[] args) {
    int[] longArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,21, 22, 23, 24, 25, 26,99, 100};
    System.out.println( asnwer(longArray, 12));

}}
