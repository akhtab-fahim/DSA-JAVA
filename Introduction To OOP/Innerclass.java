public class Innerclass {
    //Innerclasses can be static but outer classes cant 
    static class Test{

        String name;
        public Test(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test t1 = new Test("Rahul");
        Test t2 = new Test("Raj");
        System.out.println(t1.name);
        System.out.println(t2.name);
    }
}
 