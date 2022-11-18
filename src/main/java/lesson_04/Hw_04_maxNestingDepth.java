package lesson_04;

import java.util.Stack;

public class Hw_04_maxNestingDepth {

    public static int maxDepth(String s) {
        int count = 0;
        int vps = 0;
        for (char sing : s.toCharArray()) {
            if (sing == '(') {
                count++;
            } else if (sing == ')') {
                count--;
            }
            vps = Math.max(vps, count);
        }
        return vps;
    }

    public static int maxDepth2(String str) {
        Stack<String> stack = new Stack<>();
        int count1 = 0;
        for (char step : str.toCharArray()) {
            if (step == '(') {
                stack.push("(");
                if (stack.size() > count1) {
                    count1 = stack.size();
                }

            } else if (step == ')') {
                stack.pop();
            }
        }
        return count1;
    }

    public static void main(String[] args) {
        System.out.println(maxDepth("(1)+((2))+(((3)))"));
        System.out.println(maxDepth("(1)+(((2))+(((3))))"));
        System.out.println("________________________________");
        System.out.println(maxDepth2("(1+(2*3)+((8)/4))+1"));
    }
}
