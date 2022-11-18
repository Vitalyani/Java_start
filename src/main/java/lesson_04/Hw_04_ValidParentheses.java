package lesson_04;

import java.util.Stack;

public class Hw_04_ValidParentheses {

    public static void main(String[] args) {
        System.out.println("_____________");
        System.out.println(isValid("()"));
        System.out.println("_____________");
        System.out.println(isValid("()[]{}"));
        System.out.println("_____________");
        System.out.println(isValid("(({{[]}}))"));
        System.out.println("_____________");
        System.out.println(isValid("(({{[)}}))"));
        System.out.println("_____________");
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char sign : s.toCharArray()) {
            if (sign == '(') {
                stack.push(')');
            }
            else if (sign == '[') {
                stack.push(']');
            }
            else if (sign == '{') {
                stack.push('}');
            }
            else if (stack.isEmpty() || stack.pop() != sign) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
