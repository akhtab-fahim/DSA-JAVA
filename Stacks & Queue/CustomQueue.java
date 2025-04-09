public class CustomQueue {
    private int data[];
    private static final int DEFAULT_SIZE = 10;
    private int end = -1;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        data = new int[size];
    }

    public boolean isFull() {
        return end == data.length - 1;
    }

    private boolean isEmpty() {
        return end == -1;
    }

    public boolean insert(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }
        end++;
        data[end] = item;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        for (int i = 0; i < end; i++) {
            data[i] = data[i + 1];
        }
        end--;
        return removed;
    }

    public void display() {
        for (int i = 0; i <= end; i++) {
            System.out.print(data[i] + "<=");
        }
        System.out.print("END");
    }
}
