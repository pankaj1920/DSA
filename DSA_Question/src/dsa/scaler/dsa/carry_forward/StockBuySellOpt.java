package dsa.scaler.dsa.carry_forward;

public class StockBuySellOpt {
    public static void main(String[] args) {
//        int[] arr = {16,17,5,2,9,2,3,1};
        int[] arr = {5,2,9,2,3,1,17};

        System.out.println(findMaxProfit(arr));
    }

    private static int findMaxProfit(int[] arr) {
        int n = arr.length;
        int maxPrice = arr[n-1];
        int profit =0;

        for (int i = n-2;i>=0;i--){
            if (arr[i]>maxPrice){
                maxPrice = arr[i];
            }

            if (maxPrice - arr[i] > profit){
                profit = maxPrice-arr[i];
            }
        }
        return profit;
    }
}
