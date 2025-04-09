public class PeakIndexMountain {
    static int findPeak(int arr[]){
        int start =0;
        int end = arr.length-1;
        int middle;
        while(start<end){
            middle = (start + end )/2;
            if(arr[middle] > arr[middle+1]){    //you are in the decending part of that array 
                end = middle;
            }else{  //accending part 
                start=middle+1;
            }
        }
        //at the end start and end will be pointing to a single element that will be ans 
        return start;
    }
    public static void main(String[] args) {
        int arr[] ={0,2,1,0};
        System.out.println(arr[findPeak(arr)]);
    }
}
