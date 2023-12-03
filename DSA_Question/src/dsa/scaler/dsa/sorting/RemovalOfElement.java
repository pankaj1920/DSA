package dsa.scaler.dsa.sorting;

import java.util.Arrays;

public class RemovalOfElement {
    public static void main(String[] args) {

        int [] arr = {4,6,1};

        System.out.println(getMinimalRemovaCount(arr));
    }

    private static int getMinimalRemovaCount(int[] arr) {
        int sum =0;

        Arrays.sort(arr);

        reverseArrr(arr);


        for (int i =0; i<arr.length;i++){
            sum += ((i+1) * arr[i]);
        }
        return sum;
    }

    private static void reverseArrr(int[] arr) {
        int start =0;
        int end = arr.length-1;

        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
