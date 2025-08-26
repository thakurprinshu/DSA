package stack;

public class StackSort {
    public static void sortStack(Mystack stack) {
        Mystack temp = new Mystack(stack.size());

        while (!stack.isEmpty()) {
            int curr = stack.pop();
            while (!temp.isEmpty() && temp.peek() > curr) {
                stack.push(temp.pop());
            }
            temp.push(curr);
        }
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }

    public static void main(String[] args) {
        Mystack stack = new Mystack(10);
        stack.push(3);
        stack.push(5);
        stack.push(1);
        stack.push(4);

        System.out.print("Original Stack: ");
        stack.printStack();

        sortStack(stack);

        System.out.print("Sorted Stack: ");
        stack.printStack();
    }
}
