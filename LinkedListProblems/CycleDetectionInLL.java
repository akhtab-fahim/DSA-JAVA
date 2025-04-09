
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class CycleDetectionInLL {

    class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                 next = null;
             }
         }
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return  true;
            }
        }
        return false;
        
    }
    public int elementOfCycle(ListNode head) {
        int count = 0;
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                ListNode temp = slow;
                do { 
                    temp = temp.next;
                    count++;
                    
                } while (temp!=slow);
                return count;
            }
        }
        return 0;
        
    }

    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode slow = head;
        ListNode fast = head;

        while(slow!=null && fast!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                length = elementOfCycle(slow);
                break;

            }
        }
        if(length == 0){return null;}

        //finding start node
        ListNode f = head;
        ListNode s = head;
        for(int i = 0;i<length;i++){
            s=s.next;

        }
        while(f!=s){
            f = f.next;
            s= s.next;
        }

        return f;


        
    }
    
        
        
    }

