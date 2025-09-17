def myPow(x: float, n: int) -> float:
    # Handle negative powers
    if n < 0:
        x = 1 / x
        n = -n

    result = 1.0
    while n > 0:
        if n % 2 == 1:   # If n is odd
            result *= x
        x *= x
        n //= 2
    return result


# Driver code
x, n = 2.0000, -2
ans = myPow(x, n)
print(f"{ans:.6f}")   # prints with 6 decimal places
