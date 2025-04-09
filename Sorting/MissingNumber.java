//https://leetcode.com/problems/missing-number/submissions/1433985987
public class MissingNumber {
    static void swap(int arr[], int s, int e) {
        int temp = arr[e];
        arr[e] = arr[s];
        arr[s] = temp;
    }

    static int cycle(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // Searching for the missing number
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j]) return j;
        }
        return arr.length;
    }

    public static void main(String[] args) {
        int arr[] = {3, 0, 1, 2,5};
        System.out.println("Missing item is " + cycle(arr));
    }
}
