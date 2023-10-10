package dsa.scaler.two_d_array;

import java.util.Arrays;

public class TransposeArray {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

        int [][]result = transpose(array);
        System.out.println(Arrays.deepToString(result));
    }

    private static int[][] transpose(int[][] array) {
        int rowLength = array.length; //3
        int colLength = array[0].length; // 5


        int [][] ans = new int[colLength][rowLength]; // 5 3

        for (int row =0; row < rowLength;row++){
            for (int col=0; col<colLength; col++){
                ans[col][row] = array[row][col];
            }
        }

        return ans;

    }
}
