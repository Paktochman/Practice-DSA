import java.util.Arrays;

class ConcatenationArray {
    public static void main(String[] args) {
        int nums[] = {1, 4, 1, 2};
        int ans[] = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i]; // place again after n
        }
        
        return ans;
    }
}
