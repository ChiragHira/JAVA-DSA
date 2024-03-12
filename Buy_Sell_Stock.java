package SingleDimensionArray;

public class Buy_Sell_Stock {

    public static int MaxProfit(int [] stocks){
        int buyPrise = Integer.MAX_VALUE;  // It is the variable which track the minimum stock prise;
        int profit = 0;
        int n = stocks.length;

        for (int i = 0; i < n; i++){
            if(stocks[i] < buyPrise)
                buyPrise = stocks[i];

            profit = Math.max( stocks[i]-buyPrise , profit);
        }

        return profit;
    }
    public static void main(String[] args) {

        int stock [] = {7,1,5,3,6,4};
        System.out.println("The maximum profit is " + MaxProfit(stock));


    }
}
