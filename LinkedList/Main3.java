public class Main3 {
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insertBeg(12);
        list.insertBeg(15);
        list.insertBeg(6);
        list.delete(6);
        list.display();
    }
}
