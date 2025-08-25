package stack;

import java.util.Stack;

public class EvalPostfix {
    public static int evalPostfix(String expr) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expr.split(" ");
        for (String token : tokens) {
            if (token.matches("\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    case "+" -> stack.push(a + b);
                    case "-" -> stack.push(a - b);
                    case "*" -> stack.push(a * b);
                    case "/" -> stack.push(a / b);
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String expression = "2 3 1 * + 9 -";
        System.out.println("Result: " + evalPostfix(expression)); // Output: -4
    }
}
