public abstract class Parent {
    int age;
    public Parent(int age){
        this.age = age;
    }
    //abstract methods dont have body 
    abstract void carrer(String name);
    abstract int siblings(int num);

    static void hello(){};
}

