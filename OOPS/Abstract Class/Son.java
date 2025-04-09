public class Son extends Parent{
    public Son(){
        super(12);
    }
    
    public void carrer(String name){
        System.out.println("Carrer "+name);
    }
    
    public int siblings(int num){
        return num;
    }
    public static void main(String[] args) {
        Son s = new Son();
        s.carrer("doctor");

        System.out.println(s.siblings(2));
        
        /* we cant instantated a abstact class */
        // Parent p = new Parent(12);
    }
}
