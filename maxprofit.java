class MaxProfit {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                buy = prices[i];
                maxProfit += prices[i + 1] - buy;
                buy = 0;
            }
        }
        return maxProfit;
    }
}
