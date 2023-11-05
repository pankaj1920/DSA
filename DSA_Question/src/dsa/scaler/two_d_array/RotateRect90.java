package dsa.scaler.two_d_array;

import java.util.Arrays;

public class RotateRect90 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        System.out.println(Arrays.deepToString(rotate9(arr)));
    }

    private static int[][] rotate9(int[][] arr) {
        int rowLength = arr.length;
        int colLength = arr[0].length;
        int[][] output = new int[colLength][rowLength];

        for (int row = 0; row<rowLength;row++){
            int outputColIndex = (rowLength-1)-row;
            System.out.println(outputColIndex);
            for (int col =0; col<colLength;col++){
                output[col][row] = arr[outputColIndex][col];
            }
        }

        return output;
    }

}
