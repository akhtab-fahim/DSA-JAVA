
public class RichestWealth {
    static int findWealth(int nums[][]){
        int max =0;
        for(int i = 0; i < nums.length; i++) {
            int wealth=0;
            for(int j=0;j<nums[i].length;j++){
                wealth +=nums[i][j];
                if(wealth>max){max = wealth;}
                
            } 
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[][] ={{1,5},{7,3},{3,5}};
        System.out.println(findWealth(nums));
    }
}
