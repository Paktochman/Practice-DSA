import java.util.HashMap;

public class CountSubarraysXOR {
    public static int countSubarraysXOR(int[] nums, int k) {
        HashMap<Integer, Integer> xorFreq = new HashMap<>();
        int count = 0, prefixXOR = 0;

        for (int num : nums) {
            prefixXOR ^= num;

            if (prefixXOR == k) {
                count++;
            }

            if (xorFreq.containsKey(prefixXOR ^ k)) {
                count += xorFreq.get(prefixXOR ^ k);
            }

            xorFreq.put(prefixXOR, xorFreq.getOrDefault(prefixXOR, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 2, 2, 6, 4};
        int k1 = 6;
        System.out.println(countSubarraysXOR(nums1, k1)); // Output: 4

        int[] nums2 = {5, 6, 7, 8, 9};
        int k2 = 5;
        System.out.println(countSubarraysXOR(nums2, k2)); // Output: 2
    }
}
