//https://leetcode.com/problems/find-the-duplicate-number/submissions/1434021558
public class FindDuplicate {
    static void swap(int arr[],int s,int e){
        int temp = arr[e];
        arr[e]=arr[s];
        arr[s]=temp;
    }
    static  int findDuplicate(int[] nums) {
        int i=0;
        if(nums[i]!=i+1){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }
            else{
                return nums[i];
            }
        }else{
            i++;
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int nums[] = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }
}
