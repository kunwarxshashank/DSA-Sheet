
public class StockBuySell {

    /* Bruteforce Time Complexity: 0(n^2) & Space Complexity 0(1)

      public static int Stock(int arr[]) {
        int maxprofit = 0;
            for (int i = 0; i < arr.length; i++) {
                int buy = arr[i];
                    for (int j = i+1; j < arr.length; j++) {
                        int sell = arr[j];
                        if(buy<sell){
                        int profit = sell-buy; // 5
                        maxprofit = Math.max(profit, maxprofit);
                    }
                }
            }
        return maxprofit;
      }

     */

    public static int Stock(int price[]) {
        int maxprofit = 0;
        int lowest = price[0]; // 2

        if (price == null || price.length == 0) return 0;

        for (int i = 0; i < price.length; i++) {
            
            lowest = Math.min(price[i], lowest);
            int profit = price[i] - lowest;
            maxprofit = Math.max(maxprofit, profit);

        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int price[] = { 7,1,5,3,6,4 };
        int result = Stock(price);
        System.out.println(result);
    }
}
