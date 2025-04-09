import java.util.Stack;

public class QueueUsingStacks {
    private final Stack<Integer> first;
    private final Stack<Integer> second;
    private int size;
    public QueueUsingStacks() {
        first = new Stack<>();
        second = new Stack<>();
        size =0;
        
    }
    
    public void push(int x) {
        first.add(x);
        size++;
        
    }
    
    public int pop() {
        for(int i=0;i<size;i++){
            second.push(first.pop());
        }
        int removed = second.pop();
        size--;
        for(int i=0;i<size;i++){
            first.push(second.pop());
        }
        return removed;
    }
    
    public int peek() {
        return first.peek();
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
}
