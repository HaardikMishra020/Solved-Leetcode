class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=Integer.MIN_VALUE;
        int maxPrice=prices[prices.length-1];
        for(int i=prices.length-1;i>=0;i--){
            if (prices[i]<=maxPrice){
                maxProfit=Math.max(maxProfit,maxPrice-prices[i]);
            }
            else maxPrice=prices[i];
        }

        return Math.max(maxProfit,0);   
    }
}