
public void class RemoveDuplicates {
    public void removeDuplicate(Node temp){
        if(temp == null){
            return temp;
        }
        while(temp.next!=null){
            if(temp.next.value == temp.value){
                temp.next = temp.next.next;
                size--;
            }
            temp = temp.next; 
        } 
    }
}
