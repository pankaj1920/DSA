package dsa.lovebabbar.supreme_2.recurssion;

import java.util.Arrays;

public class DoubleArrayIndex {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};
        int index = 0;

        System.out.println(Arrays.toString(dobleArray(arr,index)));
    }

    private static int[] dobleArray(int[] arr, int index) {
        if (index>=arr.length){
            return  arr;
        }

        arr[index] = 2* arr[index];

        return dobleArray(arr,index+1);
    }
}
