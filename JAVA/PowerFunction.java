public class PowerFunction {
    public static double myPow(double x, int n) {
        long N = n; // use long to handle Integer.MIN_VALUE
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        double result = 1.0;
        while (N > 0) {
            if (N % 2 == 1) { // if n is odd
                result *= x;
            }
            x *= x;
            N /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        double x1 = 2.0000;
        int n1 = 10;
        double ans1 = myPow(x1, n1);
        System.out.printf("%.6f\n", ans1); // 6 decimal places

        double x2 = 2.0000;
        int n2 = -2;
        double ans2 = myPow(x2, n2);
        System.out.printf("%.6f\n", ans2); // 6 decimal places
    }
}
