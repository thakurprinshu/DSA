package stack;

class Mystack {
    private int[] arr;
    private int top;
    private int size;

    Mystack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if (isEmpty()) return -1;
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

