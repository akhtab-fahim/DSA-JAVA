
import java.util.Arrays;

public class RecBubbleSort {
    static void bubbleSort(int arr[],int a,int i){
        if(a==0) return;
        if(a>i){
            if(arr[i]>arr[i+1]){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i]=temp;
            }
            bubbleSort(arr, a, i+1);
        }else{
            bubbleSort(arr, a-1, 0);
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {4,2,3,1};
        bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
}
