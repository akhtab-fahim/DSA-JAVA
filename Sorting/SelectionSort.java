import java.util.Arrays;

public class SelectionSort {
    static void selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            int last = arr.length -1 -i;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr, last, maxIndex);
        }
    }
    static int getMaxIndex(int arr[],int s,int e){
        int max = s;
        for(int i=s;i<=e;i++){
            if(arr[max]<arr[i]){
                max =i;
            }
        }
        return max;
    }

    static void swap(int arr[],int start,int end){
        int temp = arr[start];
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }

    public static void main(String[] args) {
        int arr[] = {1,4,5,8,0,6,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
