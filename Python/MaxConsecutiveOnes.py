def find_max_consecutive_ones(nums):
    max_count = count = 0
    for num in nums:
        if num == 1:
            count += 1
            max_count = max(max_count, count)
        else:
            count = 0
    return max_count

# Examples
nums1 = [1, 1, 0, 0, 1, 1, 1, 0]
print(find_max_consecutive_ones(nums1))  # Output: 3

nums2 = [0, 0, 0, 0, 0, 0, 0, 0]
print(find_max_consecutive_ones(nums2))  # Output: 0
