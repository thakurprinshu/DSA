package stack;
public class Main {
    public static void main(String[] args) {
        MinStack stack = new MinStack(10); // pass capacity for Mystack

        stack.push(3);
        stack.push(5);
        System.out.println("Min: " + stack.getMin()); // 3

        stack.push(2);
        stack.push(1);
        System.out.println("Min: " + stack.getMin()); // 1

        stack.pop();
        System.out.println("Min: " + stack.getMin()); // 2

        stack.pop();
        System.out.println("Min: " + stack.getMin()); // 3
    }
}


