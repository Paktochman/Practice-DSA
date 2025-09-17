def two_sum(nums, target):
    num_map = {}
    for i, num in enumerate(nums):
        complement = target - num
        if complement in num_map:
            return [min(num_map[complement], i), max(num_map[complement], i)]
        num_map[num] = i
    return []

# Test cases
print(two_sum([1, 6, 2, 10, 3], 7))   # [0, 1]
print(two_sum([1, 3, 5, -7, 6, -3], 0))  # [1, 5]
