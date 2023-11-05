package dsa.scaler.two_d_array;

import java.util.Arrays;

public class RotateSq90 {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(rotatesq(arr)));
    }

    private static int[][] rotatesq(int[][] arr) {

        int[][] output = new int[arr.length][arr.length];
        for(int row = 0; row<arr.length;row++){
            for(int col=0;col<arr.length;col++){
                output[row][col] = arr[col][row];
            }
        }

        return output;
    }
}
