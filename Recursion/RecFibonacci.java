
public class RecFibonacci {
    public static void main(String[] args) {
        fibo(5);
        System.out.println(fibo(6));
        System.out.println(fiboFormula(6));
    }
    static int fiboFormula(int n){
        return (int)((1/Math.sqrt(5))*((Math.pow((1+Math.sqrt(5))/2, n))-(Math.pow((1-Math.sqrt(5))/2, n))));
    }
    static int fibo(int n){
        // if(n==0) return 0;
        // if(n==1) return 1;
        if(n<2){return n;}
        return fibo(n-1)+fibo(n-2);
    }
}
