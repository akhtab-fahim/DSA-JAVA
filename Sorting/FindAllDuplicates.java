
import java.util.ArrayList;
import java.util.List;
public class FindAllDuplicates {
    static void swap(int arr[],int s,int e){
        int temp = arr[e];
        arr[e]=arr[s];
        arr[s]=temp;
    }
    static List<Integer> findAllDuplicate(int[] nums) {
        int i=0;
        int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        //finding the duplicate elements
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans.add(nums[j]);
            }
        }     
        return ans; 
    }
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        System.out.println(findAllDuplicate(nums));
    }
}
