package dsa.scaler.dsa.prifix;

import java.util.Arrays;

public class SumQueries {
    public static void main(String[] args) {

        int[] arr = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};

        int[][] queries = {{4, 8}, {3, 7}, {1, 3}, {7, 7}, {3, 6}, {0, 4}};


        System.out.println(Arrays.toString(rangeSum(arr,queries)));
        pSum(arr,queries);
        System.out.println();
        rangeSumExistingArray(arr,queries);
    }

    private static void rangeSumExistingArray(int[] arr,int[][] queries){

        for (int i = 1; i<arr.length;i++){
            arr[i] = arr[i]+arr[i-1];
        }

        for (int i = 0 ;i<queries.length;i++){
            int Left = queries[i][0];
            int Right = queries[i][1];

            long sumRange = 0;
            if (Left ==0){
                sumRange = arr[Right];
            }else {
                sumRange = arr[Right] - arr[Left -1];
            }

            System.out.print(sumRange+" ");
        }

    }
    private static void pSum(int[] arr,int[][] queries){

        long [] pSumArray = new long[arr.length];

        pSumArray[0] = arr[0];

        for (int i =1;i < arr.length;i++){
            pSumArray[i] = pSumArray[i-1]+arr[i];
        }

        for (int i =0; i<queries.length;i++ ){
            int Left = queries[i][0];
            int Right = queries[i][1];


            long sumOfRange= 0;
            if (Left ==0){
                sumOfRange = pSumArray[Right];
            }else {
                sumOfRange =   pSumArray[Right] - pSumArray[Left-1];
            }
            System.out.print(sumOfRange+" ");
        }
    }

    private static long[] rangeSum(int[] arr, int[][] queries) {

        int queriesLength = queries.length;
        long [] ans = new long[queriesLength];

        for (int i = 0; i<queriesLength;i++){
            int Left = queries[i][0];
            int Right = queries[i][1];
            long sum =0;

            for (int j =Left; j<=Right;j++){
                sum=sum+arr[j];
            }

            ans[i] = sum;

        }

        return ans;
    }
}