import java.util.*;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;  // duplicate found
            }
            set.add(num);
        }

        return false; // no duplicates
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 2, 3, 4};

        System.out.println(containsDuplicate(nums1)); // true
        System.out.println(containsDuplicate(nums2)); // false
    }
}
