public class ReveseNum {
    public static void main(String[] args) {
        System.out.println(reverseNum(123,0));
        System.out.println(reverseNum2(123));
        System.out.println(palindrome(121));
            }
    static int reverseNum(int n,int sum){
        if(n==0) return sum;
        return reverseNum(n/10,sum*10+n%10);
    }
    static int reverseNum2(int n){
        int digits = (int)Math.log10(n)+1;
        return helper(n,digits);
    }
    static int helper(int n,int digits){
        if(n%10==n) return n;
        return n%10* (int)Math.pow(10, digits-1) + helper(n/10,--digits);
    }
    static boolean palindrome(int n){
        return (n==reverseNum(n, 0));
    }
    
    
}
 