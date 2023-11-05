package dsa.scaler.two_d_array;

import java.util.Arrays;

public class SmallestInCol {
    public static void main(String[] args) {
       int[][] arr = {{7, 5, 4},{9, 2, 8}};

        System.out.println(Arrays.toString(smallest(arr)));
    }

    private static int[] smallest(int[][] arr) {
        int rowLen = arr.length;
        int colLen = arr[0].length;

        int[] output = new int[colLen];

        for (int row=0;row<colLen;row++){
            int min = Integer.MAX_VALUE;
            for (int col =0; col<rowLen;col++){

                if (arr[col][row]<min){
                    min = arr[col][row];
                }

            }

            output[row] =min;

        }

        return output;
    }
}
