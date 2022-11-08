package lesson_02;

public class hw_02_climbingStairs2 {
    public static void main(String[] args) {
        System.out.println(climbStairs2(1));
        System.out.println(climbStairs2(2));
        System.out.println(climbStairs2(3));
        System.out.println(climbStairs2(5));
        System.out.println(climbStairs2(10));
        System.out.println(climbStairs2(25));
        System.out.println(climbStairs2(45));
    }
    public static int climbStairs2(int n) {
        int[] cache = new int[n + 1];
        if(n == 0) return 1;
        if(n < 0) return 0;
        if(cache[n] != 0) return cache[n];
        cache[n] = climbStairs2(n - 1) + climbStairs2(n - 2);
        return cache[n];
    }
}
