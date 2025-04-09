import java.util.Arrays;

public class InPlaceMergeSort {
    static void inPlaceMergesort(int arr[],int s,int e){
        if((e-s)==1) return;
        int mid = (s+e)/2;
        inPlaceMergesort(arr, s, mid);
        inPlaceMergesort(arr, mid, e) ;
        merge(arr,s,mid,e);
    }   
    static void merge(int arr[],int s,int mid,int e){
        int mix[ ] = new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while(i<mid && j<e){
           if(arr[i]>arr[j]){ mix[k]=arr[j];j++;}
           else{
            mix[k]=arr[i];
            i++;
           } 
            k++;
        }
        //add the remaining elements
        while(i<mid){
            mix[k]=arr[i];
            i++;k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;k++;
        }
        for (int l = 0; l < mix.length; l++) {
           arr[s+l]=mix[l];
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,5,3,6,9,10};
        inPlaceMergesort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
