import org.w3c.dom.Node;

public class PalinDromeLL {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
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


    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;

        ListNode prevNode = null;
        ListNode currentNode = head;
        for(int i=0;currentNode!=null && i<left-1;i++){
            prevNode = currentNode;
            currentNode = currentNode.next;
        }

        ListNode last= prevNode;
        ListNode newEnd= currentNode;
        ListNode nextNode = currentNode.next;
        //reversing between left and right 
        for (int i = 0;currentNode!=null && i<right-left+1; i++) {
           currentNode.next = prevNode;
           prevNode = currentNode;
           currentNode = nextNode;
           if(nextNode!=null){
            nextNode = nextNode.next;
           }
            
        }
        if(last!=null){
            last.next = prevNode;
        }else{
            head = prevNode;
        }
        newEnd.next = currentNode;
        return head;
    }
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
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
        public boolean isPalindrome(ListNode head) {
            ListNode middle = middleNode(head);
            ListNode secondHead = inplaceReversal(middle);
            ListNode reReverseHead = secondHead;

            while(head!=null && secondHead!=null){
                if(head.val != secondHead.val){
                    return false;
                }
                head = head.next;
                secondHead = secondHead.next;
            }

            reverseRec(reReverseHead);
            if(head == null && secondHead == null){

                return true;
            }
            return false;

        }
    

}
