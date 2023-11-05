package dsa.scaler.dsa.prifix;

import java.util.ArrayList;
import java.util.List;

public class SumOfEvenIndex {
    public static void main(String[] args) {
        int[] A = {2, 1, 8, 3, 9};
        int[][] queries = {{0,3}, {2,4}};

        List<Integer> result = calculateEvenSum(A, queries);

        for (int sum : result) {
            System.out.println(sum);
        }
    }

    public static List<Integer> calculateEvenSum(int[] A, int[][] queries) {
        int N = A.length;

        // Step 1: Calculate the prefix sum array for even indices
        int[] prefixSum = new int[N];
        prefixSum[0] = A[0];
        for (int i = 2; i < N; i += 2) {
            prefixSum[i] = prefixSum[i - 2] + A[i];
        }

        List<Integer> results = new ArrayList<>();

        // Step 2: Process each query
        for (int[] query : queries) {
            int L = query[0];
            int R = query[1];
            int evenSum = 0;

            if (L == 0) {
                evenSum = prefixSum[R];
            } else {
                evenSum = prefixSum[R] - prefixSum[L - 2];
            }

            results.add(evenSum);
        }

        return results;


    }
}
