package dsa.scaler.dsa.subarray;

import java.util.Arrays;

public class SubArrayUsingPrifix {
    public static void main(String[] args) {
        int [] arr = {2,8,-1,4};

        findSubArrSumUsingPrifix(arr);
        findSubArrSumExtraVar(arr);

        findMaxSumOneLoop(arr);
    }

    private static void findMaxSumOneLoop(int[] arr) {

        int sum = arr[0];
        int max = arr[0];

        for (int i =1; i<arr.length;i++){
            if (sum <0){
                sum =0;
            }
            sum = sum+ arr[i];

            if (sum>max){
                max = sum;
            }
        }

        System.out.println("Max "+max);
    }

    private static void findSubArrSumExtraVar(int[] arr) {


        for (int i =0; i<arr.length;i++){

            int sum =0;
            for (int k =i; k<arr.length;k++){

                sum= sum+arr[k];
                System.out.print(sum+" ");
            }
            System.out.println();

        }
    }

    private static void findSubArrSumUsingPrifix(int[] arr) {

        int[] pSumArray = new int[arr.length];

        pSumArray[0] = arr[0];

        for (int i =1; i< arr.length;i++){
            pSumArray[i] = pSumArray[i-1]+arr[i];
        }

        System.out.println(Arrays.toString(pSumArray));

        for (int j =0; j<arr.length;j++){
            for (int k = j; k<arr.length;k++){
                if (j==0){
                    System.out.print(pSumArray[k]+ " ");
                }else{
                    System.out.print(pSumArray[k] -pSumArray[j-1]+" ");
                }
            }
            System.out.println();
        }
    }


}
