public class Singleton {
    private Singleton(){

    }
    
    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null) {
            instance = new Singleton();

        }
        return instance;

    }

    public static void main(String[] args) {
        Singleton s1 = new Singleton();
        Singleton s2 = new Singleton();
        Singleton s3 = new Singleton();


    }
}
