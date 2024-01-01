package dsa.lovebabbar.supreme_2.recurssion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {20, 60, 55, 15, 45, 30, 72};

        int start = 0;
        int end = arr.length - 1;
        mergeSort(arr, start, end);

        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + (end - start)) / 2;

        // Left Array
        mergeSort(arr, start, mid);

        // Right Array
        mergeSort(arr, mid + 1, end);

        // merge the 2 sorted array

        merge(arr, start, end);


    }

    private static void merge(int[] arr, int start, int end) {

        int mid = (start + (end - start)) / 2;
        int lenLeft = mid - start + 1;
        int lenRight = end - (mid + 1) + 1;


        int[] leftArr = new int[lenLeft];
        int[] rightArr = new int[lenRight];

        // copy in left array from original arr
        int k = start;

        for (int i = 0; i < lenLeft; i++) {
            leftArr[i] = arr[k];
            k++;
        }

        // copy in right arr from original arr

        k = mid + 1;

        for (int j = 0; j < lenRight; j++) {
            rightArr[j] = arr[k];
            k++;
        }

        //actual merge logic

        int leftIndex = 0;
        int rightIndex = 0;
        int mainArrIndex = 0;

        while (leftIndex < lenLeft && rightIndex < lenRight) {
            if (leftArr[leftIndex] < rightArr[rightIndex]) {
                arr[mainArrIndex] = leftArr[leftIndex];
                mainArrIndex++;
                leftIndex++;
            } else {
                arr[mainArrIndex] = rightArr[rightIndex];
                mainArrIndex++;
                rightIndex++;
            }
        }

        // 2 more cases
        // 1 case -> left array exhaust but right array me element abhi bhi bacche hai
        while (rightIndex < lenRight) {
            arr[mainArrIndex] = rightArr[rightIndex];
            rightIndex++;
            mainArrIndex++;
        }

        // 2 case -> right array exhaust hogye but left array me element ahi bache hai
        while (leftIndex < lenLeft) {
            arr[mainArrIndex] = leftArr[leftIndex];
            mainArrIndex++;
            leftIndex++;
        }
    }
}
