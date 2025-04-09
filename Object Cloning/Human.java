public class Human implements Cloneable {
    int age;
    String name;
    int arr[] = {2,3,4,5};
    public Human(int age,String nam){
        this.age = age;
        this.name = nam;

    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        //shallow copy
        Human twin = (Human)super.clone();

        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
            
        }

        return twin;
    }
}
