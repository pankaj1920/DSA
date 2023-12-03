package practice;

import java.util.Arrays;

public class InPlacePrifixSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        long[] prifxSum = new long[arr.length];

        for (int i =1; i<arr.length;i++){
            arr[i] = arr[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
