
public class NumWithEvenNoOfDigits {
    static int findNumbers(int[] nums) {
        int count =0;
        for(int x:nums){
            if((countDigits(x))%2==0){count ++;} //if((countDigitsFast(x))%2==0){count ++;} 
        }
        return count;
        
    }
    static int countDigits(int a) {
        int count =0;
        while(a>0){
            a=a/10;
            count ++;
        }
        return count; 
        
    }
    static int countDigitsFast(int a) {
        return (int)Math.log10(a)+1; 
        
    }
    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
