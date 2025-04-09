import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Implementation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(9);
        stack.push(2);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //In JAVA queue is an interface which is implemented using LinkedList 
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(32);
        queue.add(13);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(23);
        deque.addLast(12);
        deque.addFirst(15);
        

    }    
}
