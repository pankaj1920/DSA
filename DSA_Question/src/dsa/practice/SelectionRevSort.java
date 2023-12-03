package dsa.practice;

import java.util.Arrays;

public class SelectionRevSort {
    public static void main(String[] args) {
        int[] arr = {12, 2,11, 13, 5, 6};

        revSelSrt(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void revSelSrt(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int last = arr.length - 1 - i;

            int minIndex = getMinInd(arr, 0, last);
            swap(arr, minIndex, last);
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void swap(int[] arr, int minIndex, int last) {

        int temp = arr[minIndex];
        arr[minIndex] = arr[last];
        arr[last] = temp;
    }

    private static int getMinInd(int[] arr, int start, int last) {

        int minInd = start;

        for (int i = start; i < last; i++) {
            if (arr[i] <= arr[minInd]) {
                minInd = i;
            }
        }

        return minInd;
    }
}
