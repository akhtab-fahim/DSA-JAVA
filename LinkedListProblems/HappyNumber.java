public class HappyNumber {
    
    
    public int square(int num){
        int square = 0,rem;
        while(num>0){
            rem = num%10;
            square += (int)Math.pow(rem, 2);
            num = num/10;
        }
        return square;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        
        do {
            slow = square(slow);         
            fast = square(square(fast)); 
            
            if (fast == 1) return true;  
        } while (slow != fast);
        return slow == 1; // Final check
    }
}
