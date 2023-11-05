package dsa.scaler.two_d_array;

import java.util.Arrays;

public class SmallestInRow {
    public static void main(String[] args) {
        int[][] arr = {{7, 5, 4}, {9, 2, 8}};
        System.out.println(Arrays.toString(findSmallest(arr)));
    }

    private static int[] findSmallest(int[][] arr) {
        int[] output = new int[arr.length];

        int rowLength = arr.length;
        int colLength = arr[0].length;

        for (int row =0; row<rowLength;row++){
            int min = Integer.MAX_VALUE;
            for (int col =0;col<colLength;col++){
                if (arr[row][col]<min){
                    min = arr[row][col];
                }
            }

            output[row]= min;
        }

        return output;
    }
}
