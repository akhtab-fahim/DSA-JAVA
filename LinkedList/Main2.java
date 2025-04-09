public class Main2 {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(12);
        list.insertFirst(8);
        list.insertFirst(23);
        list.insertLast(106);
        list.insert(69, 3);

        list.display();
        // list.revDisplay();
    }
}
