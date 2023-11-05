package dsa.scaler.dsa.prifix;

public class FindEvenInRange {

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 7, 9, 8, 6, 3, 4, 9};

        int[][] queries = {{4, 8}, {3, 9}, {2, 7}, {0, 4}};

        findTheEvenBrut(arr, queries);
        System.out.println();
        System.out.println();
        System.out.println();
        findTheEvenPri(arr, queries);
    }

    private static void findTheEvenPri(int[] arr, int[][] queries) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1]+arr[i];
        }


        for (int i =0;i<queries.length;i++){
            int Left =queries[i][0];
            int Right = queries[i][1];

            if (Left ==0){
                int e = arr[Right];
                System.out.println(e);
            }else{
                int even = arr[Right] - arr[Left-1];
                System.out.println(even);
            }
        }

    }

    private static void findTheEvenBrut(int[] arr, int[][] queries) {

        for (int i = 0; i < queries.length; i++) {

            int Left = queries[i][0];
            int Right = queries[i][1];

            int sum = 0;

            for (int j = Left; j <= Right; j++) {

                if (arr[j] % 2 == 0) {
                    sum++;
                }

            }
            System.out.println(sum);

        }
    }
}
