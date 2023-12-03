package dsa.scaler.test;

import java.util.Arrays;

public class ProfitOfDay {

    public static void main(String[] args) {

        int [] A= {1,-1,0};
        int [][] B= {{0,2},{1,2}};
        System.out.println(Arrays.toString(solve(A,B)));
    }

    public static  long[] solve(int[] A, int[][] B) {

        int arrLen = A.length;
        long[] preSum = new long[arrLen];

        long[] outArr =new long[B.length];

        preSum[0] = A[0];

        for (int i=1; i<arrLen;i++){
            preSum[i]= preSum[i-1]+A[i];
        }

        System.out.println(Arrays.toString(preSum));

        int count =0;
        for (int j =0; j<B.length;j++){
            int Left = B[j][0];
            int Right = B[j][1];
            long num = preSum[Right]-preSum[Left];

        }

        return outArr;
    }
}
