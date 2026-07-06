class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int max = 0;
        int curr = 0;

        while(j<prices.length){
            if(prices[i] < prices[j]){
                curr = prices[j] - prices[i];
                if (curr > max){
                    max = curr;
                }
                j++;
            }
            else{
                i = j;
                j = i + 1;
            }
        }

        return max;
    }
}
