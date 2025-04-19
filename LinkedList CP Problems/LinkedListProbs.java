
import java.net.Inet4Address;

import MergeTwoSortedLL.ListNode;
import java.awt.ItemSelectable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LinkedListProbs {
    class MyLinkedList {
        
        private Node head;
        private Node tail;
        private int size;

        private class Node{
            int value;
            Node next;

            public Node(int value) {
                this.value = value;
            }
            public Node(int value,Node next) {
                this.value = value;
                this.next = next;
            }

        }
        public MyLinkedList() {
            this.size = 0;
        }

        
        public int get(int index) {
            Node temp = head;
            if(index<0 || index>=size) return -1;
            for(int i = 0;i<index;i++){
                temp = temp.next;
            }
            return temp.value;
        }
        
        public void addAtHead(int val) {
            Node newnNode = new Node(val);
            if(tail == null){
                head = tail = newnNode;
            }else{
                newnNode.next = head;
                head = newnNode;
            }
            size++;
        }
        
        public void addAtTail(int val) {
            if(tail == null)    addAtHead(val);
            else{
                Node newNode = new Node(val);
                tail.next = newNode;
                tail = newNode;
                size++;
            }
        }
        
        public void addAtIndex(int index, int val) {
            if(index<0 || index>size) return;
            Node newNode = new Node(val);
            Node temp = head;
            if(index == 0){
                addAtHead(val);
                return;   
            }
            if(index == size){
                addAtTail(val);
                return;
            }
                
            for(int i = 0;i<index-1;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;

        }
        
        public void deleteAtIndex(int index) {
            if(index<0 || index>=size) return;
            if(index == 0){
                if(size == 1 && head == tail){
                    head = tail = null;
                }else{
                    head = head.next;
                }
                size--;
            }else if(index == size-1){
                Node prevNode = head;
                for(int i = 0;i<index-1;i++){
                    prevNode = prevNode.next;
                }
                prevNode.next = null;
                tail = prevNode;
                size--;

            }else{
                Node prevNode = head;
                for(int i = 0;i<index-1;i++){
                    prevNode = prevNode.next;
                }
                prevNode.next = prevNode.next.next;
                size--;
            }
        }


    }

    
    /**
     * Your MyLinkedList object will be instantiated and called as such:
     * MyLinkedList obj = new MyLinkedList();
     * int param_1 = obj.get(index);
     * obj.addAtHead(val);
     * obj.addAtTail(val);
     * obj.addAtIndex(index,val);
     * obj.deleteAtIndex(index);
     */
    
     
    public ListNode reverseList(ListNode head) {
        ListNode prevNode,currentNode,nextNode = head;
        nextNode.next = null;
        while(currentNode!=null){
            currentNode = nextNode;
            nextNode = nextNode.next;
            nextNode.next = currentNode;
            prevNode = currentNode;
        }
        return currentNode;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack<Integer> st = new Stack<>();
        while(temp!=null){
            st.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            if(temp.val != st.pop()){
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode mid1 = findMiddle1(head);
        ListNode newhead = reverseList(mid1.next);
        ListNode first = head,second = newhead;
        while(first!=null && second!=null){
            if(first.val!=second.val) return false;
            first = first.next;
            second = second.next;
        }
        return true;
    }
    private ListNode findMiddle1(ListNode head){
        ListNode slow = head,fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        List<Integer> num = new ArrayList<>();
        while(temp != null){
            num.add(temp.val);
            temp = temp.next.next;
        }
        temp = head.next;
        while(temp != null){
            num.add(temp.val);
            temp = temp.next.next;
        }
        temp = head;
        int index = 0;
        while(temp!=null){
                temp.val = num.get(index);
                index++;
                temp = temp.next;
        }
        return head;
    }

    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        list.sort(Integer::compareTo);
        temp = head;
        int index = 0;
        while(temp!=null){
            temp.val = list.get(index);
            index++;
            temp = temp.next;
        }
        return head;
    }
}
