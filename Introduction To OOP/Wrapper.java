

public class Wrapper {
    public static void main(String[] args) {
        Integer num = 45;
        Integer a = 10;
        Integer b = 20;
        swap(a,b);
        System.out.println(a);        
        System.out.println(b);        
    }
    static void swap(Integer a , Integer b){
        Integer temp = a ;
        a = b;
        b = temp;
    }
}
