import java.util.Arrays;

public class SortColors {
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                // Swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 2, 1, 0};
        int[] arr2 = {0, 0, 1, 1, 1};
        int[] arr3 = {1, 1, 2, 2, 1};

        sortColors(arr1);
        sortColors(arr2);
        sortColors(arr3);

        System.out.println(Arrays.toString(arr1)); // [0, 0, 1, 1, 2]
        System.out.println(Arrays.toString(arr2)); // [0, 0, 1, 1, 1]
        System.out.println(Arrays.toString(arr3)); // [1, 1, 1, 2, 2]
    }
}

