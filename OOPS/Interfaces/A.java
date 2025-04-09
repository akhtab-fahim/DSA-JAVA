public interface  A {
    static void greeting(){
        System.out.println("Im static method");
    }
    default void fun(){
        System.out.println("Im in A");
    }
}
