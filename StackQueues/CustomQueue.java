package StackQueues;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = -1;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length - 1;
    }

    public boolean isEmpty() {
        return end == -1;
    }

    public int add(int item) throws Exception {
        if (isFull())
            throw new Exception("Queue is full");

        data[++end] = item;
        return item;
    }

    public int remove() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty");

        int removed = data[0];
        for (int i = 1; i <= end; i++)
            data[i - 1] = data[i];

        end--;
        return removed;
    }

    public int peek() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty");

        return data[0];
    }

    public void display() {
        for (int i = 0; i <= end; i++) {
            System.out.print(data[i] + " < - ");
        }

        System.out.println("END");
    }
}
