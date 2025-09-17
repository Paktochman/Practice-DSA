import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // skip duplicates
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) left++;
                else right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, -2, 0, 3, -3, 5};
        System.out.println(threeSum(nums1)); // [[-3, -2, 5], [-3, 0, 3], [-2, 0, 2]]

        int[] nums2 = {2, -1, -1, 3, -1};
        System.out.println(threeSum(nums2)); // [[-1, -1, 2]]
    }
}
