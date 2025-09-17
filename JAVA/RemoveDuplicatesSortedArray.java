public class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueIndex = 0; // pointer for unique elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }
        return uniqueIndex + 1; // number of unique elements
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 3, 3, 5, 6};
        int k = removeDuplicates(nums);
        System.out.println("Number of unique elements: " + k); // Output: 4

        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
