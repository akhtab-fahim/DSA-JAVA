

public class Main {
    public static void main(String[] args) {
        // LinkedList<Integer> list = new LinkedList<>();

        SinglyLL list = new SinglyLL();
        list.insertFirst(12);
        list.insertFirst(5);
        list.insertFirst(22);
        list.insertFirst(24);
        list.insertLast(69);
        list.insert(30, 3);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.delete(2);
        list.display();
        list.bubbleSort();
        list.display();
        // System.out.println(list.findNode(5));


        
    }
}
    