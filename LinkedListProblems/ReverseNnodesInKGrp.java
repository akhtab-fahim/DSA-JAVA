public class ReverseNnodesInKGrp {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null  ){
            return head;

        }

        ListNode prevNode = null;
        ListNode currentNode = head;

        while(true){
            
        

        

        ListNode last= prevNode;
        ListNode newEnd= currentNode;
        ListNode nextNode = currentNode.next;
        //reversing between left and right 
        for (int i = 0;currentNode!=null && i<k; i++) {
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
        if(currentNode == null ){
            break;
        }
    }
        return head;
    }
}
