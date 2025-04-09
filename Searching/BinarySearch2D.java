
import java.util.Arrays;

public class BinarySearch2D {
    static int[] search2D(int arr[][],int target){
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[] {i,j};
                }
            } 
        }
        return new int[] {-1,-1};
    }
    static int maxElement(int arr[][]){
        int max =0;
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max =arr[i][j];
                }
            } 
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[][] = { {1,2,4},
                        {2,4,2,5,69},
                        {1,2}};
        
        System.out.println("elemnt add "+Arrays.toString(search2D(arr, 69)));
        System.out.println("max elemnt  "+maxElement(arr));
    }
}
