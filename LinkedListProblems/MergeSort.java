public class MergeSort {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while(list1!=null && list2 != null){
            if(list1.val<list2.val){
                temp.next = list1;
                list1 = list1.next;

            }else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        while(list1!=null){
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }

        while(list2!=null){
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }

        return head.next;
        
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

    public ListNode sortList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode middle = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(middle);

        return mergeTwoLists(left, right);


    }
}
