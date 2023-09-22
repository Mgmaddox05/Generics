import java.util.Stack;
public class App {
    public static void main(String[] args) throws Exception {
       /*System.out.println("Hello, World!");
        Stack<Integer> int_stack1 = new Stack<>();
        int_stack1.push(3);
        System.out.println(int_stack1.pop());
        int_stack1.push(5);
        System.out.println(int_stack1.peek());
        System.out.println(int_stack1.pop());
        System.out.println(int_stack1.isEmpty()); */

        String postfixExpression = "52+3*";
        String result = changePostfix(postfixExpression);
        System.out.println("Result: " + result);

        postfixExpression = "52+6*";
        result = changePostfix(postfixExpression);
        System.out.println("Result: " + result);

        postfixExpression = "59+4*";
        result = changePostfix(postfixExpression);
        System.out.println("Result: " + result);
    }
        
        
    static boolean isOperator(char x) {
        return (x == '+' || x == '-' || x == '/' || x == '*');
    }

    static String changePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        int length = expression.length();

        for (int i = 0; i < length; i++) {
            char currentChar = expression.charAt(i);

            if (isOperator(currentChar)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                int result;
                switch (currentChar) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + currentChar);
                }

                stack.push(result);
            } else {
                // If it's not an operator, assume it's an integer operand
                stack.push(Integer.parseInt(String.valueOf(currentChar)));
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid postfix expression");
        }

        return String.valueOf(stack.peek());
    }
    }

