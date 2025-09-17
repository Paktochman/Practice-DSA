def majorityElement(nums):
    n = len(nums)

    # Step 1: Find potential candidates
    candidate1, candidate2, count1, count2 = 0, 0, 0, 0
    for num in nums:
        if num == candidate1:
            count1 += 1
        elif num == candidate2:
            count2 += 1
        elif count1 == 0:
            candidate1, count1 = num, 1
        elif count2 == 0:
            candidate2, count2 = num, 1
        else:
            count1 -= 1
            count2 -= 1

    # Step 2: Verify candidates
    count1 = sum(1 for num in nums if num == candidate1)
    count2 = sum(1 for num in nums if num == candidate2)

    result = []
    if count1 > n // 3:
        result.append(candidate1)
    if count2 > n // 3:
        result.append(candidate2)

    return result


# Example usage
print(majorityElement([1, 2, 1, 1, 3, 2]))      # [1]
print(majorityElement([1, 2, 1, 1, 3, 2, 2]))   # [1, 2]
