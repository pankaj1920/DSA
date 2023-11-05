package dsa.scaler.two_d_array;

import java.util.Arrays;

public class ReverseFromIndex {
    public static void main(String[] args) {
        int[] A = {2,5,6};

        System.out.println(Arrays.toString(solve(A,0,2)));
    }

    public static int[] solve(int[] A, int B, int C) {

        while(B<C){

            int temp = A[B];
            A[B]= A[C];
            A[C]=temp;

            B++;
            C--;
        }

        return A;
    }
}
