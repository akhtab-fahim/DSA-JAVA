public class RotationCount {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(countRotation(arr)+1);
    }
    static int countRotation(int arr[]){
        int start =0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        while(start<=end){
            //check 4 cases 
            if(arr[mid]>arr[mid+1] && mid<end){
                return mid;
            }
            if(arr[mid]<arr[mid-1] && mid>start){
                return mid-1;
            }
            if(arr[start]>=arr[mid] ){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
