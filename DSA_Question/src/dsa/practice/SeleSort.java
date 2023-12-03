package dsa.practice;

import java.util.Arrays;

public class SeleSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        selSrt(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selSrt(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int last = arr.length - 1 - i;
            int maxInt = getMaxIndex(arr, 0, last);

            swapArr(arr,maxInt,last);

        }
    }

    private static void swapArr(int[] arr, int maxInt, int last) {
        int temp = arr[maxInt];
        arr[maxInt] = arr[last];
        arr[last] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int maxInd = start;

        for (int i = start; i <= end; i++) {

            if (arr[i]>arr[maxInd]){
                maxInd = i;
            }

        }
        return maxInd;
    }
}
