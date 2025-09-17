from typing import List
from collections import defaultdict

def count_subarrays_xor(nums: List[int], k: int) -> int:
    xor_freq = defaultdict(int)
    count = 0
    prefix_xor = 0

    for num in nums:
        prefix_xor ^= num

        if prefix_xor == k:
            count += 1

        count += xor_freq[prefix_xor ^ k]
        xor_freq[prefix_xor] += 1

    return count

# Test cases
nums1 = [4, 2, 2, 6, 4]
k1 = 6
print(count_subarrays_xor(nums1, k1))  # Output: 4

nums2 = [5, 6, 7, 8, 9]
k2 = 5
print(count_subarrays_xor(nums2, k2))  # Output: 2
