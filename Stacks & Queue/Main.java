
public class Main {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack();
        stack.push(34);
        stack.push(9);
        stack.push(2);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        DynamicStack dstack = new DynamicStack();
        // dstack.push(12);
        // dstack.push(12);
        // dstack.push(12);
        // dstack.push(12);
        // dstack.push(12);
        // dstack.push(12);
        // dstack.push(12);
        // dstack.push(12);
        // dstack.push(12);
        // dstack.push(12);
        // dstack.pop();
        // dstack.pop();
        // dstack.pop();
        // dstack.pop();
        // dstack.pop();
        // dstack.pop();
        // dstack.pop();
        // dstack.pop();
        // dstack.pop();
        // dstack.pop();
        CircularQueue queue = new CircularQueue(5);
        queue.insert(4);
        queue.insert(45);
        queue.insert(24);
        queue.insert(43);
        queue.insert(123);
        queue.display();
        System.out.println();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.insert(10);
        queue.insert(20);
        queue.remove(); 
        queue.display();
        queue.remove();
        System.out.println();
        queue.display();
    }
}
