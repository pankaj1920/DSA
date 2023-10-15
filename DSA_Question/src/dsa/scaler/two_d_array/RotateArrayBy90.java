package dsa.scaler.two_d_array;

import java.util.Arrays;

public class RotateArrayBy90 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        System.out.println(Arrays.deepToString(rotate90(arr)));
    }

    private static int[][] rotate90(int[][] arr) {

        int[][] transposeArray = getTransposeArray(arr);
        int[][] rotateArray = reverseArr(transposeArray);

        return rotateArray;
    }


    private static int[][] getTransposeArray(int[][] arr) {
        int rowLength = arr.length;
        int colLength = arr[0].length;

        int[][] tranposeArr = new int[colLength][rowLength];


        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                tranposeArr[col][row] = arr[row][col];
            }
        }
        return tranposeArr;
    }

    private static int[][] reverseArr(int[][] transposeArray) {

        for (int row = 0; row < transposeArray.length; row++) {
            int start = 0;
            int end = transposeArray[row].length -1;

            while (start < end){

                int temp = transposeArray[row][start];
                transposeArray[row][start] = transposeArray[row][end];
                transposeArray[row][end] = temp;

                end--;
                start++;
            }

        }

        return transposeArray;
    }
}
