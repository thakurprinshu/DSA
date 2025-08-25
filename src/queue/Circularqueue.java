package queue;

class Circularqueue {
    int[] arr;
    int front, rear, size;

    Circularqueue(int capacity) {
        arr = new int[capacity];
        size = capacity;
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return (rear + 1) % size == front;
    }

    void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) front = 0; // first element
        rear = (rear + 1) % size;
        arr[rear] = x;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int val = arr[front];
        if (front == rear) { // only one element
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return val;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
}

