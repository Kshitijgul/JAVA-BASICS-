package JAVA_Programs.Arrays;

public class Stocks_in_array {
    public static int Buy_sell_stock(int[] prices ){
        int buy_price = Integer.MAX_VALUE;
        int max_profit=0;

        for (int i =0;i<prices.length;i++){
            if (prices[i]>buy_price){
                int profit=prices[i]-buy_price;
                max_profit=Math.max(max_profit,profit);
            }else {
                buy_price=prices[i];
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int result = Buy_sell_stock(prices);
        System.out.println(result);

    }
}
