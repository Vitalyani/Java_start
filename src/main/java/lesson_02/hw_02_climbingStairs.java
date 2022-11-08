package lesson_02;

public class hw_02_climbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(1));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(10));
        System.out.println(climbStairs(25));
        System.out.println(climbStairs(45));
    }
    public static int climbStairs(int n) {
        int[] cash = new int[n + 1];
        cash[0] = 1;
        cash[1] = 1;
        steps(n, cash);
        return cash[n];
    }
    private static int steps(int n, int[] cash) {
        if(cash[n] != 0) return cash[n];
        cash[n] = steps(n - 1,cash) + steps(n - 2,cash);
        return cash[n];
    }
}
