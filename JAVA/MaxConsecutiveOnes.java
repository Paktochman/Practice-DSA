public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 0, 0, 1, 1, 1, 0};
        System.out.println(findMaxConsecutiveOnes(nums1)); // Output: 3

        int[] nums2 = {0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(findMaxConsecutiveOnes(nums2)); // Output: 0
    }
}
