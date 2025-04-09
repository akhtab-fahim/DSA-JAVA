
import java.util.List;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();

        // list is a parent class  vector implements List

        vector.add(12);
        vector.add(22);
        vector.add(1234);
        vector.add(56);

        System.out.println(vector);
    }
}
