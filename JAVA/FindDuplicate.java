//Given an array of integers nums containing n + 1 integers where each integer is in the range 
//[1, n] inclusive, there is only one repeated number in nums, return this duplicate number.
//You must not modify the array (assume it is read-only), and you must use only constant extra space.
//Your algorithm should run in less than O(n²) time.

public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        // Phase 1: Detect intersection point in the cycle
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find entrance to cycle (duplicate number)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums)); // Output: 2
    }
}
