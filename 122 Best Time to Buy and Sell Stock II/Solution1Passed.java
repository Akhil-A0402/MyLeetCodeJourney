public class Solution1Passed{
    public int maxProfit(int[] prices) {    
        // when the size of array is 0 or 1
        if(prices.length<1) {
            return 0;
        }

        int sum=0;

        for(int i=1;i<prices.length;i++) {
            if(prices[i-1]<prices[i]) {
                sum+=prices[i]-prices[i-1];
            }
        }
        return sum;
    }
}