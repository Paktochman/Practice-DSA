def remove_duplicates(nums):
    if not nums:
        return 0

    unique_index = 0
    for i in range(1, len(nums)):
        if nums[i] != nums[unique_index]:
            unique_index += 1
            nums[unique_index] = nums[i]

    return unique_index + 1  # number of unique elements

# Example
nums = [0, 0, 3, 3, 5, 6]
k = remove_duplicates(nums)
print("Number of unique elements:", k)  # Output: 4
print("Modified array:", nums[:k])  # Output: [0, 3, 5, 6]
