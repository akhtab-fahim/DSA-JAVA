

public class DoublyLL {

    private Node head;
    // private  Node tail;
    private int size;

    public DoublyLL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node newnNode = new Node(val);
        newnNode.prev = null;
        newnNode.next = head;
        if(head!=null){
            head.prev = newnNode;
        }
        head = newnNode;
        size++;

    }

    public void insertLast(int value){
        if(head == null){
            insertFirst(value);
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        Node newNode = new Node(value);
        newNode.next = null;
        current.next = newNode;
        newNode.prev = current;
        size++;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        } else if (index == size) {
            insertLast(value);
            return;
        }
        Node newNode = new Node(value);
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        newNode.prev = temp;
        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        size++;
    }

    public void insertAfter(int value, int after) {
        Node newNode = new Node(value);
        Node temp = findNode(value);
        if(temp==null){
            System.out.println(after + " doesnt exist in linked list ! ERROR");
            return;
        }
        newNode.prev = temp;
        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        size++;
    }
    public Node findNode(int val){
        Node temp = head;
        while(temp!=null){
            if(temp.value==val){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " ->");
            temp = temp.next;

        }
        System.out.print("End\n");
        

    }

    public void revDisplay(){
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
        }
        Node lastNode = temp;
        while(lastNode!=null){
            System.out.print(lastNode.value+"->");
            lastNode = lastNode.prev;
        }
        

    }
    

    class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }

        Node(int value,Node prev,Node next){
            this.value = value;
            this.next= next;
            this.prev = prev;

        }
    }
}
