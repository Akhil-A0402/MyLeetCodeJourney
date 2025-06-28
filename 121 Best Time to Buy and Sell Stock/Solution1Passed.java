class Solution1Passed {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = left + 1;
        int maxSum = 0;

        while(right<prices.length) {
            if(prices[left]>prices[right]) {
                left = right;
            } else {
                int diff = prices[right] - prices[left];
                maxSum = Math.max(maxSum, diff);
            }
            right++;
        }
        return maxSum;
    }
}