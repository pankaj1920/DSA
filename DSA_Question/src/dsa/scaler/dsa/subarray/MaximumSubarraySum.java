package dsa.scaler.dsa.subarray;

public class MaximumSubarraySum {

    public static void main(String[] args) {
//        int[] arr = {41, 36, -13, 14, -25};
        int[] arr = {-22,32,-8,-16,-17,-20,-36,-47};

        System.out.println(findMaxSumThreeLoop(arr));
        System.out.println();
        System.out.println(findMaxSumPrifix(arr));
    }

    private static long findMaxSumPrifix(int[] arr) {
        long max = Integer.MIN_VALUE;

        long[] prifixSum = new long[arr.length];
        prifixSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prifixSum[i] = prifixSum[i - 1] + arr[i];
        }

        for (int j = 0; j < arr.length; j++) {
            for (int k = j; k < arr.length; k++) {

                long num =0;
                if (j == 0) {
                    if (prifixSum[k] > max) {
                        max = prifixSum[k];
                    }
                } else {
                    num = prifixSum[k] - prifixSum[j - 1];
                    if (num > max) {
                        max = prifixSum[k];
                    }
                }
            }
        }

        return max;
    }

    private static int findMaxSumThreeLoop(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }
}
