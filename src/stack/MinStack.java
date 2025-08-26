package stack;

class MinStack {
    private Mystack mainStack;
    private Mystack minStack;
    private int capacity;

    public MinStack(int capacity) {
        this.capacity = capacity;
        mainStack = new Mystack(capacity);
        minStack = new Mystack(capacity);
    }

    public void push(int val) {
        mainStack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (mainStack.isEmpty()) {
            System.out.println("Stack is empty, cannot pop.");
            return;
        }
        int removed = mainStack.pop();
        if (!minStack.isEmpty() && removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public boolean isEmpty() {
        return mainStack.isEmpty();
    }
}


