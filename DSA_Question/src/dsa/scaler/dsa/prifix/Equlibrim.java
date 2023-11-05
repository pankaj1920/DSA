package dsa.scaler.dsa.prifix;

public class Equlibrim {

    public static void main(String[] args) {
        int [] arr = {-3,2,4-1};

        equlibrim(arr);

    }

    private static void equlibrim(int[] arr) {
        int n = arr.length;
        long[] pSum = new long[n];

        pSum[0] = arr[0];
        for (int i =1; i<arr.length;i++){
            pSum[i]= pSum[i-1]+arr[i];
        }


    }


}
