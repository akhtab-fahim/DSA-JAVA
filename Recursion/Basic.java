public class Basic {
    public static void main(String[] args) {
        message(6);
    }
    static void message(int n){
        System.out.println("Hello Rizz");
        if(n>1){ message(n-1);}    
    }
}
