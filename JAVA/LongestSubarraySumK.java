import java.util.HashMap;

public class LongestSubarraySumK {
    public static int longestSubarraySumK(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSumIndex = new HashMap<>();
        int sum = 0, maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                maxLength = i + 1;
            }

            if (!prefixSumIndex.containsKey(sum)) {
                prefixSumIndex.put(sum, i);
            }

            if (prefixSumIndex.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - prefixSumIndex.get(sum - k));
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums1 = {10, 5, 2, 7, 1, 9};
        int k1 = 15;
        System.out.println(longestSubarraySumK(nums1, k1)); // Output: 4

        int[] nums2 = {-3, 2, 1};
        int k2 = 6;
        System.out.println(longestSubarraySumK(nums2, k2)); // Output: 0
    }
}
