
import java.util.Arrays;

public class RecMergeSort {
    static int[] mergesort(int arr[]){
        if(arr.length==1) return arr;
        int mid = arr.length/2;
        int left[] = mergesort(Arrays.copyOfRange(arr, 0, mid)) ;
        int right[] = mergesort(Arrays.copyOfRange(arr, mid, arr.length)) ;
        return merge(left,right);
    }   
    static int[] merge(int left[],int right[]){
        int mix[ ] = new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
           if(left[i]>right[j]){ mix[k]=right[j];j++;}
           else{
            mix[k]=left[i];
            i++;
           } 
            k++;
        }
        //add the remaining elements
        while(i<left.length){
            mix[k]=left[i];
            i++;k++;
        }
        while(j<right.length){
            mix[k]=right[j];
            j++;k++;
        }
        return mix;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,3,6,9,10};
        System.out.println(Arrays.toString(mergesort(arr)));
    }
}