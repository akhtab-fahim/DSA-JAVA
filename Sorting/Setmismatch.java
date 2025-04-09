import java.util.Arrays;

public class Setmismatch {
    static void swap(int nums[], int s, int e) {
        int temp = nums[e];
        nums[e] = nums[s];
        nums[s] = temp;
    }

    static int[] setmismatch(int nums[]) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Searching for the missing number
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=j+1) return new int[] {nums[j],j+1}; //no of times of occurence , missing element 
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int nums[] = {1,2,2,4};
        System.out.println(Arrays.toString(setmismatch(nums)));
    }
}

