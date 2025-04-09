
import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int arr[],int a,int i,int max){
        if(a==0) return;
        if(a>i){
            if(arr[i]>arr[max]) {selectionSort(arr, a, ++i, i);}
            else {selectionSort(arr, a, ++i, max); }       
        } 
        else{//swapping with the maximum element
            int temp = arr[max];
            arr[max]=arr[a-1];
            arr[a-1] = temp;
            selectionSort(arr, a-1, 0, 0);
        }
    }
    
    public static void main(String[] args) {
        int arr[] ={4,3,2,1};
        selectionSort(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
}
