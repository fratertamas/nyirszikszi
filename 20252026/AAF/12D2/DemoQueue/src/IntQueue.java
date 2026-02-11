public class IntQueue {
    private int[] data = new int[10];
    private int front = 0;
    private int rear = 0;

    public boolean isEmpty() {
        return front == rear;
    }

    public int size() {
        return rear - front;
    }

    public void enqueue(int x) {
        if (rear == data.length) throw new RuntimeException("Queue full");
        data[rear++] = x;
    }

    public int dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue empty");
        return data[front++];
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Queue empty");
        return data[front];
    }
}
