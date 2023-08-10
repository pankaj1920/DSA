package dsa.lovebabbar.supreme_1.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,58,32,15,8,96,45,21};

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    private static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++){
            for (int j =1;j< arr.length;j++){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}
