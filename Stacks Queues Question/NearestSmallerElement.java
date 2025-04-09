
import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerElement {
    static int[] findNSE(int arr[]){
        int nge[] = new int[arr.length];
        Stack<Integer> st = new Stack<>(); 
        for(int i=0;i<arr.length;i++){
            if(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();

            }
            if(st.isEmpty()){
                nge[i] = -1;
            }else{
                nge[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return nge;
    }

    public static void main(String[] args) {
        int arr[] ={5,7,9,6,7,4,5};
        int res[] = findNSE(arr);
        System.out.println(Arrays.toString(res));
    }
}
