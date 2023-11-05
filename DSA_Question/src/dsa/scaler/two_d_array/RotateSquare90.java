package dsa.scaler.two_d_array;

import java.util.Arrays;

public class RotateSquare90 {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        System.out.println(Arrays.deepToString(rotateSQ90(arr)));
    }

    private static int[][] rotateSQ90(int[][] arr) {
        int [][] tran = tranSq(arr);

        return reveSq(tran);
    }


    private static int[][] tranSq(int[][] arr) {

        for (int row =0; row<arr.length; row++){
            for (int col = row+1; col<arr.length;col++){
                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row]= temp;
            }
        }


        return arr;
    }

    private static int[][] reveSq(int[][] tran) {

        for (int row = 0;row<tran.length;row++){
            int start =0;
            int end = tran[row].length;

            while (start<end){
                int temp = tran[row][start];
                tran[row][start] = tran[row][end-1];
                tran[row][end-1]= temp;
                start++;
                end--;
            }
        }
        return tran;
    }


}
