import java.util.*;

public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        long S = (long)n * (n + 1) / 2;
        long Sq = (long)n * (n + 1) * (2L * n + 1) / 6;

        long sumNums = 0, sqNums = 0;
        for (int num : nums) {
            sumNums += num;
            sqNums += (long) num * num;
        }

        long diff1 = sumNums - S;      // A - B
        long diff2 = sqNums - Sq;      // A^2 - B^2 = (A - B)(A + B)

        long sumAB = diff2 / diff1;    // A + B

        long A = (diff1 + sumAB) / 2;
        long B = A - diff1;

        return new int[]{(int)A, (int)B};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
        // Output: [2, 3]
    }
}
