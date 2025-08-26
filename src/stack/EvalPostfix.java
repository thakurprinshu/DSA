package stack;
public class EvalPostfix {
    public static int evalPostfix(String expr) {
        String[] tokens = expr.split(" ");
        MyStack stack = new MyStack(tokens.length);

        for (String token : tokens) {
            if (token.matches("\\d+")) {   // number
                stack.push(Integer.parseInt(token));
            } else {                       // operator
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
