public class FirstMissingPositive {
    static void swap(int arr[], int s, int e) {
        int temp = arr[e];
        arr[e] = arr[s];
        arr[s] = temp;
    }

    static int firstmissingpos(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i]>0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // Searching for the missing number
        for (int j = 0; j < arr.length; j++) {
            if (j+1 != arr[j]) return j+1;
        }
        return arr.length+1; //imp*
    }
    public static void main(String[] args) {
        int arr[] = {7,8,9,11,12};
        System.out.println(firstmissingpos(arr));
    }
}
