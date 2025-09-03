// bruted 
class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(profit<prices[j]-prices[i]) profit=prices[j]-prices[i];
            }
            
        }
        return profit;
        
    }
}
//o(n)
class Solution {
    public int maxProfit(int[] prices) {
        int low=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(low>prices[i]) low=prices[i];
            if(maxprofit<prices[i]-low) maxprofit=prices[i]-low;
        }
        return maxprofit;
    }
}