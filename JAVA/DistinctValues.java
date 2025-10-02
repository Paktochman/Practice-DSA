//counting distinct integers in a list

import java.util.*;

public class DistinctValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          // number of values
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            set.add(value);           // add each number to the set
        }

        System.out.println(set.size()); // distinct count
    }
}
