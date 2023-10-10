package dsa.scaler.two_d_array;

import java.util.Arrays;

public class ReverseTheMatrix {
    public static void main(String[] args) {
        int [][] array  = {{3, 2, 6, 9, 1},{14,18,2,4,10},{5,6,3,9,8}};

        System.out.println(Arrays.deepToString(reverseArray(array)));
    }

    private static  int [][] reverseArray(int[][] array) {

        int rowLength=  array.length;
        int colLength =array[0].length;

        for (int row =0; row<rowLength;row++){
            int start = 0;
            int end = array[row].length-1;

            while (start<end){

                int temp = array[row][start];
                array[row][start]= array[row][end];
                array[row][end] = temp;

                start++;
                end--;
            }
        }
        return array;

    }
}
