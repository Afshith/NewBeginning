package HundredDaysOfCode;

public class Day_34_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {1, 3, 5, 1, 6, 4};
        int soFarMinimum = prices[0], maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < soFarMinimum){
                soFarMinimum = prices[i];
            }
            else{
                int profit = prices[i] - soFarMinimum;
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        System.out.println(maxProfit);

    }
}
