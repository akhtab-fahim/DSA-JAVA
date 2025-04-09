
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human rizz = new Human(20, "Rizz");
        Human twin = (Human)rizz.clone();
        System.out.println(rizz.name + " " + rizz.age + " " + Arrays.toString(rizz.arr));
        System.out.println(twin.name + " " + twin.age + " " + Arrays.toString(twin.arr));
    }
}
