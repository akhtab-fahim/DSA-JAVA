
public class CircularQueue {
    private int data[];
    private static final int DEFAULT_SIZE = 10;
    private int end = 0,start =0,size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        data = new int[size];
    }

    private boolean isEmpty() {
        return end == -1;
    }

    private boolean isFull() {
        return end == data.length;
    }
    public boolean insert(int item) throws Exception {
        if(isEmpty()){
            return false;
        }
        data[end] = item;
        end++;
        end = (end)%data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[start];
        start++;
        start = start % data.length;
        size--;
        return removed;
    }

    public void display() {
        int i = start;
        do{
            System.out.print(data[i]+" ");
            i++;
            i = i %data.length;
        }while(i != end);
        System.out.print("END");
    }    
}
