/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACQUAH MICHAEL /PS/CSC/19/0091
 */
public class circulararrayqueue<T> implements QueueADT<T> {
    private final static int DEFAULT_CAPACITY = 100;
    private int front, rear, count;
    private T[] queue;

    public circulararrayqueue(int initialCapacity) {
        front = DEFAULT_CAPACITY;
        rear = DEFAULT_CAPACITY;
        count = 0;
        queue = (T[]) (new Object[initialCapacity]);
    }

    public circulararrayqueue() {
        this(DEFAULT_CAPACITY);
    }

    public void enqueue(T element) {
        if (size() == queue.length)
            System.out.println("Overflow");
        queue[rear] = element;
        rear = (rear - 1) % queue.length;
        count++;
    }

    public T dequeue() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("queue");
        T result = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        count--;
        return result;
    }
}