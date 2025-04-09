
import java.util.Arrays;


public class GameOfTwoStacks {
    static int gameOfTwoStacks(int allowedSum,int a[],int b[]){
        return twoStacks(x, a, b, 0, 0) - 1;
    }

    private static int twoStacks(int allowedSum,int a[],int b[],int sum,int count){
        if(sum>allowedSum){
            return count;
        }
        if(a.length==0 || b.length==0) {
            return count;
        }

        int ans1 = twoStacks(allowedSum, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count++);
        

        int ans2 = twoStacks(allowedSum, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count++);

        return Math.max(ans1, ans2);
    }
}
