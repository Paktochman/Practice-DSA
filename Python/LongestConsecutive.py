from typing import List

def longest_consecutive(nums: List[int]) -> int:
    num_set = set(nums)
    max_length = 0

    for num in num_set:
        if num - 1 not in num_set:  # start of a sequence
            current = num
            length = 1
            while current + 1 in num_set:
                current += 1
                length += 1
            max_length = max(max_length, length)

    return max_length

# Test cases
nums1 = [100, 4, 200, 1, 3, 2]
nums2 = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]

print(longest_consecutive(nums1))  # Output: 4
print(longest_consecutive(nums2))  # Output: 9
