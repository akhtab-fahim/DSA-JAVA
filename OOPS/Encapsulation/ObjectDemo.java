public class ObjectDemo {
    int num;

    public ObjectDemo(int num) {
        super();
        this.num = num;
    }
    
    public String toString(){
        return super.toString() + num ;
    }
    @Override
    public int hashCode(){
        return super.hashCode() + num;

    }
    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(12);
        ObjectDemo obj1 = new ObjectDemo(12);
        System.out.println(obj.hashCode());

        System.out.println(obj1.equals(obj));
        
        System.out.println(obj1.hashCode());
        System.out.println(obj.getClass());
    }
}