package practice;

import java.util.Arrays;

public class RangeInSum {

    public static void main(String[] args) {
        int [] arr = {-3,6,2,4,5,2,8,-9,3,1};
        int[][] queries = {{4,8},{3,7},{1,3},{7,7},{3,6},{0,4}};

        findSumBt(arr,queries);
        findSumPriNewArr(arr,queries);
        System.out.println();
        findSumPriSameArr(arr,queries);
    }

    private static void findSumPriSameArr(int[] arr, int[][] queries) {

        for (int i =1; i<arr.length; i++){
            arr[i] = arr[i-1]+arr[i];
        }

        for (int i =0; i<queries.length; i++){
            int start = queries[i][0];
            int end= queries[i][1];

            if (start == 0){
                System.out.print(arr[end] +" ");
            }else{
                System.out.print(arr[end] - arr[start -1]+ " ");
            }
        }

    }

    private static void findSumPriNewArr(int[] arr, int[][] queries) {

        long[] preSumArr = new long[arr.length];

        preSumArr[0] = arr[0];

        for (int i=1; i<arr.length;i++){
            preSumArr[i] = preSumArr[i-1]+ arr[i];
        }

        for (int i =0; i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];

            if (start == 0){
                System.out.print(preSumArr[end]+" ");
            }else {
                System.out.print(preSumArr[end] -preSumArr[start-1]+ " ");
            }
        }
    }


    private static void findSumBt(int[] arr, int[][] queries) {

        for (int i =0;i<queries.length;i++){

            int start = queries[i][0];
            int end = queries[i][1];

            int sum =0;

            for (int j = start; j<=end;j++){
                sum = sum+arr[j];
            }
            System.out.print(sum+" ");

        }
        System.out.println();
    }


}
