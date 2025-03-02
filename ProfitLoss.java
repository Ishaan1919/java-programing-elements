public class ProfitLoss{
    public static void main(String[] args){
        int cost = 129;
        int sell = 191;
        int profit = sell-cost;
        float profitpercent = ((float)profit/(float)cost)*100;
        System.out.print("The Cost Price is INR " + cost + " and Selling Price is INR " + sell + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitpercent);
    }
}