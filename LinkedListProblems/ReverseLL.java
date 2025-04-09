import org.w3c.dom.Node;

import CycleDetectionInLL.ListNode;

public class ReverseLL {
    
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
    public boolean isPalindrome(ListNode head) {
        ListNode middle = middle
    }
}
