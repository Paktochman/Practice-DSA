import java.util.Arrays;

public class KadaneAlgorithm {

    // Function to find maximum subarray sum
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either extend the current subarray or start a new one from current element
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            // Update maxSoFar if needed
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 5, -2, 7, -4};
        int[] nums2 = {-2, -3, -7, -2, -10, -4};
        int[] nums3 = {-1, 2, 3, -1, 2, -6, 5};

        System.out.println(maxSubArray(nums1)); // 15
        System.out.println(maxSubArray(nums2)); // -2
        System.out.println(maxSubArray(nums3)); // 5
    }
}
