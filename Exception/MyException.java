
public class MyException extends Exception{

    public MyException(String message) {
        super(message);
    }
    public static void main(String[] args) throws Exception {
        String name = "kyz";
        if(name.equals("kyz")){
            throw new MyException("name is kyz");
        }
    }
}
