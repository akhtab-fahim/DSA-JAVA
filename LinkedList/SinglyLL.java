
public class SinglyLL {

    private Node head;
    private Node tail;
    private Node temp;
    private int size;

    public SinglyLL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node newNode = new Node(val);
        
        newNode.next = head;
        head = newNode;

        if(tail == null){
            head = tail = newNode;

        }

        size++;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
        }
        Node newnNode = new Node(val);
        tail.next = newnNode;
        tail = newnNode;
        size++;
    }

    public void insert(int val,int index){
       if(index == 0){ insertFirst(val);}
       if(index == size) {insertLast(val);}
       temp = head;

       for(int i=1;i<index;i++){
        temp = temp.next;
       }

       Node newNode = new Node(val);
       newNode.next = temp.next;
       temp.next = newNode;

       size++;

    }

    public void deleteFirst(){
        if(tail == null){ System.out.println("Linked List is empty no element to delete");}
        if(head == tail){
            head = tail = null;
        }
        head = head.next;
        size--;
    }

    public void deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        Node prevNode = getNode(size-2);
        prevNode.next = null;
        tail = prevNode;
        size--;
        
        // temp = head;
        // Node prevNode = null;
        // while(temp!= null){
        //     prevNode = temp;
        //     temp = temp.next;
        // }
    }

    public void delete(int index){
        if(index == 0){ deleteFirst();}
        if(index == size-1) { deleteLast();}
        Node prevNode = getNode(index-1);
        // prevNode.next = prevNode.next.next; 
        Node currentNode = prevNode.next;
        prevNode.next = currentNode.next;
        currentNode.next = null;
        size--;
            }

            public Node insertRec(int index, int value, Node temp) {
                if (index == 0) {
                    Node newNode = new Node(value);
                    newNode.next = temp;
                    size++;
                    return newNode; // Return the new head if it's the first node
                }
                if (temp != null) {
                    temp.next = insertRec(index - 1, value, temp.next);
                }
                return temp;
            }

           
    

    public Node getNode(int index){
        Node node = head;
        for(int i =0;i<index;i++){
            node = node.next;
        }

        return node;
    }

    public Node findNode(int value){
        temp = head;
        while(temp!=null){
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void display(){
        temp = head;
        while(temp!= null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.print("END \n");

    }

    private class Node{
        private int value;
        private Node next;

        public Node(int val){
            this.value = val;
        }

        public Node(int val,Node next){
            this.value = val;
            this.next = next;
        }
    } 

    //reverse a LL recurcive way
    public void reverseRec(Node node){
        if(node==tail){
            head=tail;
            return ;
        }
        reverseRec(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    //Inplace Reversal
    public Node inplaceReversal(Node head){
        if(size<2){return head;}
       Node prevNode = null;
       Node currentNode = head;
       Node nextNode = head.next;

       while(currentNode!=null){
           currentNode.next = prevNode;
           prevNode = currentNode;
           currentNode = nextNode;
           if(nextNode!=null){
               nextNode = nextNode.next;
           }
       }
       head = prevNode;
       return head;
    }


    //Bubble Sort (recursive approach )

    public void bubbleSort(){
        bubbleSortLL(size-1,0);
    }

    private void bubbleSortLL(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            Node first = getNode(col);
            Node second = getNode(col+1);

            if(first.value>second.value){
                if(first==head){
                    first.next = second.next;
                    second.next = first;
                    head = second;

                }else if(second == tail){
                    Node prev = getNode(col-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }else{
                    Node prev = getNode(col-1);
                    prev.next = first;
                    first.next=second.next;
                    second.next=first;
                }
            }
            bubbleSortLL(row, col+1);
        }else{
            bubbleSortLL(row-1, 0);
        }

    }
}
