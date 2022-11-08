package lesson_02;

public class hw_02_xPowN {
    public static void main(String[] args) {
        System.out.println(xPowN(2, 5));
        System.out.println(xPowN(2, 10));
        System.out.println(xPowN(2, -10));
        System.out.println(xPowN(-2, -10));
        System.out.println(xPowN(2, 0));
        System.out.println(xPowN(2, 1));
        System.out.println(xPowN(1, 10));
        System.out.println("_______________");
        System.out.println(xPowN(-100, -10));
        System.out.println(xPowN(99.9, -10));
        System.out.println(xPowN(1.1, 2_147_483_647)); //pow = 2^31 - 1
        System.out.println(xPowN(1.1, -2_147_483_648)); //pow = -2^31
    }
    private static double xPowN(double base, int pow) {
        if(pow == 0) return 1;
        if(pow == 1) return base;
        if(base == 0 || base == 1) return base;
        if(pow < 0) {
            return 1 / base * xPowN(1 / base, -(pow + 1));
        }
        double half = xPowN(base, pow / 2);
        double result = half * half;
        if (pow % 2 == 1) result *= base;
        return result;
    }

}
