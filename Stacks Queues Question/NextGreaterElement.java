import java.util.Stack;

public class NextGreaterElement {
    static public int[] findNGE(int arr[]){
       int nge[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length-1;i>=0;i--){

            while(!st.isEmpty() && arr[i]>=st.peek()){
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
        int[] arr = { 6, 8, 0, 1, 3 };
        int[] arr1 = {5,3,1,2,4,6};
        int res[] = findNGE(arr1);
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
