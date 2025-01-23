package DataStructures;

public class MyQueue {
    private final String[] queue;
    private final int maxSize;
    private int head;
    private int tail;
    private int size;

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queue = new String[maxSize];
        this.head = 0;
        this.tail = -1;
        this.size = 0;
    }

    // Inserts an element at the rear of the queue
    public void enqueue(String element) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        tail = (tail + 1) % maxSize;
        queue[tail] = element;
        size++;
    }

    // Removes and returns the element at the front of the queue
    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        String removedElement = queue[head];
        head = (head + 1) % maxSize;
        size--;
        return removedElement;
    }

    // Returns the element at the front of the queue without removing it
    public String peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return queue[head];
    }

    // Checks if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Checks if the queue is full
    public boolean isFull() {
        return size == maxSize;
    }
}
