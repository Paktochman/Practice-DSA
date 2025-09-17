import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                int first = map.get(complement);
                int second = i;
                return new int[]{Math.min(first, second), Math.max(first, second)};
            }
            map.put(nums[i], i);
        }
        return new int[]{}; // should never reach here
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 6, 2, 10, 3};
        int target1 = 7;
        System.out.println(Arrays.toString(twoSum(nums1, target1))); // [0, 1]

        int[] nums2 = {1, 3, 5, -7, 6, -3};
        int target2 = 0;
        System.out.println(Arrays.toString(twoSum(nums2, target2))); // [1, 5]
    }
}
