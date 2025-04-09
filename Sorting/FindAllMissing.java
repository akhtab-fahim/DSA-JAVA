
import java.util.ArrayList;
import java.util.List;

public class FindAllMissing {

    static void swap(int nums[],int s,int e){
        int temp = nums[e];
        nums[e]=nums[s];
        nums[s]=temp;
    }
    static  List<Integer> findDisappearedNumbers(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
        if(nums[i]!=nums[correct]){
            swap(nums, i, correct);
        }else{
            i++;
        }
        }
        //finding the missing elements
        List<Integer> ans = new ArrayList<>();  
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans.add(j);
            }
        }     
        return ans; 
    }
    public static void main(String[] args) {
        int nums[] ={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
