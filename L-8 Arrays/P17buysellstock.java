/* You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. */
public class P17buysellstock {
    public static int buysellstock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for(int i=0; i<prices.length; i++){

            if(buyPrice < prices[i]){ //selling
                int profit = prices[i] - buyPrice; //Profit = selling - buying
                maxPrice = Math.max(maxPrice, profit);

            }else{//buying
                buyPrice = prices[i];
            }
        }
        return maxPrice;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buysellstock(prices));
    }
}
