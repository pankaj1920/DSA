package dsa.scaler.dsa.prifix;

public class FindOddRange {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 7, 9, 8, 6, 3, 4, 9};

        int[][] queries = {{4, 8}, {3, 9}, {2, 7}, {0, 4}};

        findOdd(arr, queries);
    }

    private static void findOdd(int[] arr, int[][] queries) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        for (int j = 1; j < arr.length; j++) {
            arr[j] = arr[j - 1] + arr[j];
        }

        for (int q = 0; q<queries.length;q++){
            int Left = queries[q][0];
            int Right = queries[q][1];

            if (Left == 0){
                int od = arr[Right];
                System.out.println(od);
            }else{
                int odd = arr[Right]- arr[Left-1];
                System.out.println(odd);
            }
        }

    }
}
