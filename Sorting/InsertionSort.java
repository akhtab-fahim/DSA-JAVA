import java.util.Arrays;

public class InsertionSort {
    static void insertion(int arr[]){
        for(int i =0;i<arr.length-1;i++){   //runs untill lentgh -2
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int arr[],int start,int end){
        int temp = arr[start];
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,8,0,-6,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
