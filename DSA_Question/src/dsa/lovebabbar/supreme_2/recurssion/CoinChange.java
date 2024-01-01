package dsa.lovebabbar.supreme_2.recurssion;

public class CoinChange {
    public static void main(String[] args) {
        int [] coin = {1,2,5};
        int Amount = 11;

        System.out.println(solve(coin,Amount));
    }

    public static int solve(int[] coins, int amount) {
        int ans = coinChange(coins, amount);
        if (ans == Integer.MAX_VALUE){
            return -1;
        }else {
            return ans;
        }
    }
    public static int coinChange(int[] coins, int amount) {

        if (amount ==0){
            return 0;
        }

        int ans = Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            int currentCoin = coins[i];

            // current coin hum sirf tab use karenge jb vo amount ke equal ya bada hoga

            if (currentCoin<=amount){
                int recAns = 1+coinChange(coins,amount-currentCoin);
                if (recAns != Integer.MAX_VALUE){
                    ans = recAns;
                }
            }

            min = Math.min(min,ans);
        }

        return min;
    }
}
