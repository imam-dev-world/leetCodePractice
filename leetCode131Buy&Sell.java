class Solution2 {
    public int maxProfit(int[] prices) {
        int cheapest = prices[0];
        int maxProfit = 0;
        // loop to check every element
        for(int i = 1; i<prices.length; i++){

            // check cheapest stock to buy 
            if(cheapest>prices[i]){
                cheapest=prices[i];
            }

            // check the maxProfit from selling the stock
            if(maxProfit<prices[i] && prices[i] - cheapest>maxProfit){
                maxProfit = prices[i] - cheapest ;
            }
        }
        return maxProfit;
    }
}

class Main2{
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] prices = {3,2,6,5,0,3};
        int result = s.maxProfit(prices);
        System.out.println(result);
    }
}