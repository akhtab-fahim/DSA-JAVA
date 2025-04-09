import java.util.Stack;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nse = findNSE(heights);
        int[] nge = findNGE(heights);
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int height = heights[i];
            int width = (nge[i] == -1 ? n : nge[i]) - (nse[i] == -1 ? -1 : nse[i]) - 1;
            int area = height * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    static public int[] findNGE(int arr[]) {
        int nge[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] >= st.peek()) {
                st.pop();
            }

            if (st.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }

            st.push(i);
        }

        return nge;
    }

    static int[] findNSE(int arr[]) {
        int nse[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty()) {
                nse[i] = -1;
            } else {
                nse[i] = st.peek();
            }

            st.push(i);
        }

        return nse;
    }
}


