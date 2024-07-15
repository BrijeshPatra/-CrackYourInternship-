package arrays;
public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        //check if prices are null
        if(prices==null || prices.length==0){
            return 0;
        }

        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        //traverse the price array and check for minimum
        for(int price: prices){
            if(price<minPrice){
                //update price
                minPrice=price;
            }
            //calculate profit
            int profit=price-minPrice;

            //check for profit and maxProfit
            if(profit>maxProfit){
                //update it
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
}
