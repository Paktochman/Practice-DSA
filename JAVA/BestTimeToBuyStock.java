class Solution {
    public int stockBuySell(int[] arr, int n) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            // keep track of lowest price so far
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            }

            // calculate profit if we sell today
            int profit = arr[i] - minPrice;

            // update max profit if it's better
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}