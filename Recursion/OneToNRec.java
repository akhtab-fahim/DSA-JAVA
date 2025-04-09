public class OneToNRec {
    public static void main(String[] args) {
        printInc(5);
        // printBoth(6);
    }
    static void printInc(int n){
        if(n==0) {return;}
        printInc(n-1);
        System.out.println(n);
    }
    static void printBoth(int n){
        if(n==0) {return;}
        System.out.println(n);
        printInc(n-1);
        System.out.println(n);
    }
}
