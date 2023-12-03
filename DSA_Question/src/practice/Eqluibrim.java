package practice;

public class Eqluibrim {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,1,2,3};

        findEqlib(arr);
    }

    private static void findEqlib(int[] arr) {
        long[] priFixSum = new long[arr.length];
        priFixSum[0] = arr[0];

        int count =0;
        for (int i = 1; i < arr.length; i++) {
            priFixSum[i] = priFixSum[i - 1] + arr[i];
        }

        for (int j = 0; j < arr.length; j++) {
            long leftSum = 0;
            long rightSum = 0;

            if (j != 0) {
                leftSum = priFixSum[j - 1];
            }

            rightSum = priFixSum[arr.length - 1] - priFixSum[j];

            if (leftSum == rightSum){
                count++;
            }
        }

        System.out.println(count);
    }
}
