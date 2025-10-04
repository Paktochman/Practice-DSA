import java.util.Arrays;
import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] applicants = new int[n];
        int[] apartments = new int[m];

        for (int i = 0; i < n; i++) applicants[i] = sc.nextInt();
        for (int i = 0; i < m; i++) apartments[i] = sc.nextInt();

        Arrays.sort(applicants);
        Arrays.sort(apartments);

        int i = 0, j = 0, matches = 0;

        while (i < n && j < m) {
            if (apartments[j] < applicants[i] - k) {
                j++;
            } else if (apartments[j] > applicants[i] + k) {
                i++;
            } else {
                // Match found
                matches++;
                i++;
                j++;
            }
        }

        System.out.println(matches);
        sc.close();
    }
}
