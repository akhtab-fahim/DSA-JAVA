
public class RecurciveBinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,4,5,7,9,12,17,22,34,55};
        System.out.println(binarySearch(arr, 22, 0, arr.length-1));
    }
    static int binarySearch(int arr[],int target,int s,int e){
        if(s>e) return -1;
        int mid = (s+e)/2;
        if(arr[mid]==target){
            return mid;}
        if(arr[mid]>target){
             return binarySearch(arr, target, s, mid-1);}
        else{
             return binarySearch(arr, target, mid+1, e);}
        
    }
}