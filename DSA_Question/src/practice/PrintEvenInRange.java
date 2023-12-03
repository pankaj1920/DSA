package practice;

import java.util.Arrays;

public class PrintEvenInRange {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 7, 9, 8, 6, 3, 4, 9};

        int[][] queries = {{4, 8}, {3, 9}, {2, 7}, {0, 4}};


        findEven(arr, queries);
    }

    private static void findEven(int[] arr, int[][] queries) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }


        for (int j=1; j< arr.length;j++){

            if (arr[j] ==0){
                arr[j] =arr[j-1];
            }else {
                arr[j] = arr[j-1]+arr[j];
            }
        }


        for (int q =0; q<queries.length;q++){
            int start = queries[q][0];
            int end = queries[q][1];

            if (start ==0){
                System.out.println(arr[end]);
            }else{
                int evenCount = arr[end] - arr[start-1];

                System.out.println(evenCount);
            }
        }
    }
}
