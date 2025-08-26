public class Best_Time_to_Buy_and_Sell_Stock{

    public static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE,profit = 0;
        for(int i = 0;i<prices.length;i++){
            if(prices[i] <= buyPrice){
                buyPrice = prices[i];
            }
            profit = Math.max(prices[i] - buyPrice,profit);            
        }
        return profit;
    }

    public static void main(String arg[]){
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}