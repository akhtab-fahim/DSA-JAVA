
import java.util.Arrays;

public class LeftRotaion {
    public static int [] rotateLeft(int d, int arr[]) {
        // Write your code here
            int lastElement,temp;
            for(int i = 0;i<d;i++){
                lastElement = arr[arr.length - 1];
                for(int j = 0;j<arr.length-1;j++){
                    arr[j+1] = arr[j];
                    
                    
                }
                arr[0] = lastElement;
            }
            return arr;
        }
    

        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5};
            rotateLeft(2, arr);
            System.out.println(Arrays.toString(arr));
        }
}
