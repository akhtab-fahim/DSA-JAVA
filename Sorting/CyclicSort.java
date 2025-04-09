
import java.util.Arrays;

public class CyclicSort {
    static void swap(int arr[],int s,int e){
        int temp = arr[e];
        arr[e]=arr[s];
        arr[s]=temp;
    }
    static void cyclic(int arr[]){
        //My Approach
        // for(int i=0;i<arr.length;i++){
        //     while(arr[i]-1!=i){
        //         swap(arr,arr[i]-1,i);
        //     }
        // }

        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
        if(arr[i]!=arr[correct]){
            swap(arr, i, correct);
        }else{
            i++;
        }
        }
        
    }
    public static void main(String[] args) {    //cyclic sort should be contious 
        int arr[] ={3,4,1,2,5};
        cyclic(arr);    
        System.out.println(Arrays.toString(arr));
    }
}
