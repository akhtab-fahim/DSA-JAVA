
public class BubbleSort {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public void bubbleSort(){
        bubbleSortLL(size-1,0);
    }

    private void bubbleSortLL(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            ListNode first = get(col);
            ListNode second = get(col+1);

            if(first.val>second.val){
                if(first==head){
                    first.next = second.next;
                    second.next = first;
                    head = first;

                }else if(second == tail){
                    ListNode prev = get(col-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }else{
                    ListNode prev = get(col-1);
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
