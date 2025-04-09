public class CircularLL {
    private Node head;
    private Node tail;
    private int size;

    public CircularLL(){
        this.size = 0;
    }

    public void insertBeg(int value){
        Node newNode = new Node(value);
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail=newNode;
        size++;

    }
    public void display(){
        Node temp = head;
        if(head!=null){
            do { 
                System.out.print(temp.value + "->");
                temp=temp.next;
            } while (temp!=head);
        }
        
    }
    public void insertLast(){

    }
    public void insert(){
    }
    public void delete(int val) {
        Node temp = head;
        if (temp == null) { //theres no node in the linkedlist
            return;
        }

        if (temp.value == val) {
            if (head == tail) { // Only one node in the list
                head = null;
                tail = null;
            } else {
                head = head.next;   //first element is to deleted
                tail.next = head;
            }
            return;
        }

        Node prevNode = head;
        while (temp != null && temp.value != val) {
            prevNode = temp;
            temp = temp.next;
        }

        if (temp == null) { // Node with value not found
            return;
        }

        prevNode.next = temp.next;

        // If the node to be deleted is the tail, update the tail
        if (temp == tail) {
            tail = prevNode;
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
