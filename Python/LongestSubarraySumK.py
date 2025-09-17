from typing import List

def longest_subarray_sum_k(nums: List[int], k: int) -> int:
    prefix_sum_index = {}
    total = 0
    max_len = 0

    for i, num in enumerate(nums):
        total += num

        if total == k:
            max_len = i + 1

        if total not in prefix_sum_index:
            prefix_sum_index[total] = i

        if total - k in prefix_sum_index:
            max_len = max(max_len, i - prefix_sum_index[total - k])

    return max_len

# Test cases
nums1 = [10, 5, 2, 7, 1, 9]
k1 = 15
print(longest_subarray_sum_k(nums1, k1))  # Output: 4

nums2 = [-3, 2, 1]
k2 = 6
print(longest_subarray_sum_k(nums2, k2))  # Output: 0
