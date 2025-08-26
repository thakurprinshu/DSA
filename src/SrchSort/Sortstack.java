package SrchSort;

class MyStack {
    int[] arr;
    int top, size;

    MyStack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int x) { arr[++top] = x; }
    int pop() { return arr[top--]; }
    int peek() { return arr[top]; }
    boolean isEmpty() { return top == -1; }
}

public class Sortstack{
    static void insertSorted(MyStack stack, int val) {
        if (stack.isEmpty() || val > stack.peek()) {
            stack.push(val);
            return;
        }
        int temp = stack.pop();
        insertSorted(stack, val);
        stack.push(temp);
    }

    static void sortStack(MyStack stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            insertSorted(stack, temp);
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(10);
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        sortStack(stack);
        System.out.print("Sorted Stack (Top to Bottom): ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

