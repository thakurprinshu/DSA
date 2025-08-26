package queue;

class Mystack {
    private int arr[];
    private int top;
    private int capacity;

    public Mystack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}


class QueueImplement {
    Mystack stack1;
    Mystack stack2;

    public QueueImplement(int size) {
        stack1 = new Mystack(size);
        stack2 = new Mystack(size);
    }

    void enqueue(int x) {
        stack1.push(x);
    }

    int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}



