package queue;

import java.util.Stack;

class QueueImplement {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
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
