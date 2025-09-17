def majorityElement(nums):
    candidate, count = 0, 0

    # Step 1: Find candidate
    for num in nums:
        if count == 0:
            candidate = num
        count += 1 if num == candidate else -1

    # Step 2: Guaranteed majority
    return candidate


# Example usage
print(majorityElement([7, 0, 0, 1, 7, 7, 2, 7, 7]))  # 7
print(majorityElement([1, 1, 1, 2, 1, 2]))          # 1
