package dsa.scaler.two_d_array;

import java.util.Arrays;

public class SumOfTwoArray {

    public static void main(String[] args) {

        int[][] arrayOne = {{1, 7, 3, 9}, {4, 2, 0, 3}, {8, 6, 4, 1}};
        int[][] arrayTwo = {{3, 2, 5, 1}, {4, 7, 6, 4}, {1, 3, 2, 6}};

        System.out.println(Arrays.deepToString(findSumofTwoArray(arrayOne,arrayTwo)));

    }

    private static int[][] findSumofTwoArray(int[][] arrayOne, int[][] arrayTwo) {

        int [][] ans = new int[arrayOne.length][arrayOne[0].length];

        if (arrayOne.length == arrayTwo.length && arrayOne[0].length  == arrayTwo[0].length){

            for (int i =0;i<arrayOne.length;i++){
                for (int j =0;j<arrayOne[0].length;j++){
                    ans[i][j] = arrayOne[i][j]+ arrayTwo[i][j];
                }
            }
        }

        return ans;

    }
}
