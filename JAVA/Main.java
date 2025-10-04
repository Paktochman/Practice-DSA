import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            int maxGap = 0;
            // gap from 0 to first station
            maxGap = Math.max(maxGap, a[0] - 0);
            // gaps between consecutive stations
            for (int i = 1; i < n; i++) {
                maxGap = Math.max(maxGap, a[i] - a[i-1]);
            }
            // gap from last station to x
            maxGap = Math.max(maxGap, x - a[n-1]);

            // endpoints doubling constraint
            int endpointConstraint = Math.max(2 * a[0], 2 * (x - a[n-1]));

            int ans = Math.max(maxGap, endpointConstraint);
            System.out.println(ans);
        }
        sc.close();
    }
}
