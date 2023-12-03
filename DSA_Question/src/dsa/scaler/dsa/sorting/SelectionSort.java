package dsa.scaler.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5,6,4,2};
        selectionSrt(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSrt(int[] arr) {
        for (int i=0; i< arr.length;i++){
            int minIndex = i;
            for (int j=i;j< arr.length;j++){

                if (arr[j]<arr[minIndex]){
                    minIndex=j;
                }

            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex]= temp;
        }
    }
}
