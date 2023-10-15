package dsa.scaler.two_d_array;

import java.util.Arrays;

public class TransposeSquare {

    public static void main(String[] args) {
        int[][] sq = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(Arrays.deepToString(transSquare(sq)));
    }

    private static int[][] transSquare(int[][] sq) {

        int size = sq.length;

        for (int row = 0; row<size;row++){
            for (int col =row+1;col<size;col++){

                int temp = sq[row][col];
                sq[row][col] = sq[col][row];
                sq[col][row] = temp;
            }
        }

        return sq;
    }
}
