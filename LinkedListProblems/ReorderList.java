public class ReorderList {
 
 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public ListNode reverse(ListNode head) {
    ListNode prev = null;
    ListNode current = head;
    ListNode next;

    while (current != null) {
        next = current.next; // Store next node
        current.next = prev; // Reverse the current node's pointer
        prev = current;      // Move prev to current node
        current = next;      // Move to the next node
    }
    
    return prev; // New head of the reversed list
}
  public ListNode middleNode(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;

    while(fast!=null && fast.next!=null){
        fast = fast.next.next;
        slow = slow.next;
    }

    return slow;
}

    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        ListNode mid = middleNode(head);

        ListNode headFirst = head;
        ListNode headSecond = reverse(mid);
        ListNode temp;

        while(headFirst != null && headSecond != null){
            temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;
            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }

        if(headFirst != null){
            headFirst.next = null;
        }

         
    }

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
