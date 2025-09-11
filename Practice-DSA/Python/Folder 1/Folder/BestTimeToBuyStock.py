class Solution:
    def stockBuySell(self, arr, n):
        min_price = float('inf')
        max_profit = 0
        
        for i in range(n):
            # keep track of lowest price so far
            if arr[i] < min_price:
                min_price = arr[i]
            
            # calculate profit if we sell today
            profit = arr[i] - min_price
            
            # update max profit if it's better
            if profit > max_profit:
                max_profit = profit
        
        return max_profit

# Example usage and test
if __name__ == "__main__":
    solution = Solution()
    
    # Test case 1
    prices1 = [7, 1, 5, 3, 6, 4]
    n1 = len(prices1)
    result1 = solution.stockBuySell(prices1, n1)
    print(f"Test 1 - Prices: {prices1}")
    print(f"Maximum profit: {result1}")
    print()
    
    # Test case 2
    prices2 = [7, 6, 4, 3, 1]
    n2 = len(prices2)
    result2 = solution.stockBuySell(prices2, n2)
    print(f"Test 2 - Prices: {prices2}")
    print(f"Maximum profit: {result2}")
    print()
    
    # Test case 3
    prices3 = [1, 2, 3, 4, 5]
    n3 = len(prices3)
    result3 = solution.stockBuySell(prices3, n3)
    print(f"Test 3 - Prices: {prices3}")
    print(f"Maximum profit: {result3}")