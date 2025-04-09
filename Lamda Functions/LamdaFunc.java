
import java.util.ArrayList;


public class LamdaFunc {

    interface Operation{
        int operation(int a,int b);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
            
        }

        list.forEach((item) -> {
            System.out.println(item*2);
        });

        Operation sum = (a,b) -> a+b;
        Operation sub = (a,b) -> a-b;
        
    }
}
