package dsa.scaler.array;

import java.util.ArrayList;
import java.util.Arrays;

public class SumTheArray {
    public static void main(String[] arg) {
        int[][] A = {{12, 65, 89, 74}, {22, 44, 12, 30}, {10, 12, 97, 19}};

        System.out.println(Arrays.toString(solve(A)));
    }

    public static  int[] solve(int[][] A) {

        int [] sumResult = new int[A[0].length];

        for (int row=0;row<A.length;row++){

            int sum=0;
            for (int col = 0;col<A[0].length;col++){
                sum = sum+(A[row][col]);
            }

            System.out.println(sum);

            sumResult[row]=sum;
        }

        return sumResult;


    }
}
