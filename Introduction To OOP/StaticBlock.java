public class StaticBlock {
    static int a = 5;
    static int b;

    //intiatialization of static variables using static block 
    static{ //only runs once  
        System.out.println("Im inside Static block ");
        b = a * 4;
    }
    public static void main(String[] args) {
        StaticBlock s = new StaticBlock();
        System.out.println(StaticBlock.b);
        System.out.println(StaticBlock.a);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.b);

        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.b);
        System.out.println(StaticBlock.a);
    }
}
