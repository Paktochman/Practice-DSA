def three_sum(nums):
    nums.sort()
    result = []
    n = len(nums)

    for i in range(n - 2):
        if i > 0 and nums[i] == nums[i - 1]:
            continue

        left, right = i + 1, n - 1
        while left < right:
            total = nums[i] + nums[left] + nums[right]
            if total == 0:
                result.append([nums[i], nums[left], nums[right]])
                left += 1
                right -= 1

                # skip duplicates
                while left < right and nums[left] == nums[left - 1]:
                    left += 1
                while left < right and nums[right] == nums[right + 1]:
                    right -= 1
            elif total < 0:
                left += 1
            else:
                right -= 1

    return result

# Examples
nums1 = [2, -2, 0, 3, -3, 5]
print(three_sum(nums1))  # [[-3, -2, 5], [-3, 0, 3], [-2, 0, 2]]

nums2 = [2, -1, -1, 3, -1]
print(three_sum(nums2))  # [[-1, -1, 2]]
