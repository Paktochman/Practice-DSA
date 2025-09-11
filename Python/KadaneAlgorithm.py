def max_subarray(nums):
    max_so_far = nums[0]
    max_ending_here = nums[0]

    for num in nums[1:]:
        # Either extend the current subarray or start new from current element
        max_ending_here = max(num, max_ending_here + num)
        # Update max_so_far if needed
        max_so_far = max(max_so_far, max_ending_here)

    return max_so_far

# Example usage
nums1 = [2, 3, 5, -2, 7, -4]
nums2 = [-2, -3, -7, -2, -10, -4]
nums3 = [-1, 2, 3, -1, 2, -6, 5]

print(max_subarray(nums1))  # 15
print(max_subarray(nums2))  # -2
print(max_subarray(nums3))  # 5
