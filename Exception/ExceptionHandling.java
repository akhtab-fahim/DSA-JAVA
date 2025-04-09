
public class ExceptionHandling {
    static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("dont divide by 0");
        }else{
            return a/b;
        }
    }
    public static void main(String[] args) {
        try {
            int a  = 5;
            int b = 0;
            int c = a/b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally{
            System.out.println("It will always exceute ");
        }

        divide(3, 0);
        
        

    }    
}
