package dsa.scaler.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr ={12,11,13,5,6};

        insettionSrt(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insettionSrt(int[] arr) {

        for (int i =0; i< arr.length-1;i++){

            for (int j=i+1;j>0;j--){

                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;
                }else {
                    break;
                }
            }
        }
    }
}
