def next_permutation(nums):
    n = len(nums)
    i = n - 2

    # Step 1: Find the first decreasing element from the end
    while i >= 0 and nums[i] >= nums[i + 1]:
        i -= 1

    # Step 2: If found, find next larger element to swap
    if i >= 0:
        j = n - 1
        while nums[j] <= nums[i]:
            j -= 1
        nums[i], nums[j] = nums[j], nums[i]

    # Step 3: Reverse the elements after index i
    left, right = i + 1, n - 1
    while left < right:
        nums[left], nums[right] = nums[right], nums[left]
        left += 1
        right -= 1

# Example usage
nums1 = [1, 2, 3]
next_permutation(nums1)
print(nums1)  # [1, 3, 2]

nums2 = [3, 2, 1]
next_permutation(nums2)
print(nums2)  # [1, 2, 3]

nums3 = [1, 1, 5]
next_permutation(nums3)
print(nums3)  # [1, 5, 1]
