package dsa.scaler.dsa.prifix;

public class FindSumQueries {
    public static void main(String[] args) {

        int[] arr = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};

        int[][] queries = {{4, 8}, {3, 7}, {1, 3}, {7, 7}, {3, 6}, {0, 4}};

        findSumQuEx(arr,queries);
        findSumQuSm(arr,queries);
    }

    private static void findSumQuSm(int[] arr, int[][] queries) {

        for (int i=1;i< arr.length;i++){
            arr[i] =  arr[i-1]+arr[i];
        }
        for (int i =0; i<queries.length;i++){
            int Left = queries[i][0];
            int Right = queries[i][1];
            long addSum = 0;
            if (Left ==0){
                addSum = arr[Right];

            }else {
                addSum = arr[Right]- arr[Left-1];
            }

            System.out.print(addSum);

        }
        System.out.println();
    }

    private static void findSumQuEx(int[] arr, int[][] queries) {
        long[] pSum = new long[arr.length];

        pSum[0] = arr[0];
        for (int i =1; i<arr.length;i++){
            pSum[i]= pSum[i-1]+arr[i];
        }

        for (int i =0; i<queries.length;i++){
            int Left = queries[i][0];
            int Right = queries[i][1];
            long addSum = 0;
            if (Left ==0){
               addSum = pSum[Right];

            }else {
                addSum = pSum[Right]- pSum[Left-1];
            }

            System.out.print(addSum);

        }
        System.out.println();
    }
}
