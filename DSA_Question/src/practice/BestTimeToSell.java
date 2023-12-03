package practice;

public class BestTimeToSell {
    public static void main(String[] args) {
        int[] arr = {6,7,5,2,6,2,3};

        int maxNum =0;
        int ans = 0;
        for (int i = arr.length-1; i>=0;i--){


            if (arr[i]> maxNum){
                maxNum = arr[i];
            }

          int  pofit = maxNum - arr[i];
            if (pofit>ans){
                ans = pofit;
            }
        }

        System.out.println(ans);
    }
}
