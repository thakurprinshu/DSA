package SrchSort;

public class Queuesort {
    static void sortQueue(MyQueue queue) {
        MyStack stack = new MyStack(queue.size);
        while (!queue.isEmpty()) {
            int temp = queue.dequeue();
            while (!stack.isEmpty() && stack.peek() > temp) {
                queue.enqueue(stack.pop());
            }
            stack.push(temp);
        }
        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(6);
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(2);

        sortQueue(queue);
        System.out.print("Sorted Queue: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}

