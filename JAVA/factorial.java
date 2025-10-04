import java.util.Scanner;

public class factorial {

    public static long nCr(int n, int r) {
        if (r > n) return 0;
        if (r == 0 || r == n) return 1;

        long res = 1;
        // Use the smaller of r and n-r
        if (r > n - r) r = n - r;

        for (int i = 1; i <= r; i++) {
            res = res * (n - i + 1) / i; // divide at each step to avoid overflow
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (integer): ");
        int n = sc.nextInt();

        System.out.print("Enter r (integer): ");
        int r = sc.nextInt();

        long result = nCr(n, r);
        System.out.println("nCr = " + result);
    }
}
