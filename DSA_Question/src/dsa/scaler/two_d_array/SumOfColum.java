package dsa.scaler.two_d_array;

import java.util.Arrays;

public class SumOfColum {
    public static void main(String[] args) {

        int[][] arr = {{12, 65, 89, 74}, {22, 44, 12, 30}, {10, 12, 97, 19}};

        System.out.println(Arrays.toString(columSum(arr)));
    }

    private static int[] columSum(int[][] arr) {
        int[] sumList = new int[arr[0].length];
        int rowLength = arr.length;
        int colLength = arr[0].length;

        for (int row = 0; row < colLength; row++) {
            int sum = 0;
            for (int col = 0; col < rowLength; col++) {
                sum = sum+ arr[col][row];
            }

            sumList[row] = sum;
        }


        return sumList;
    }
}
