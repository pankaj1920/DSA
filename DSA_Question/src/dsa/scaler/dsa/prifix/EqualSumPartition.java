package dsa.scaler.dsa.prifix;

import java.util.Arrays;

public class EqualSumPartition {
    public static void main(String[] args) {
//        int[] arr = {5,3,2,6,3,1};
//        int[] arr = {1,2,3,4,5,6};
        int[] arr = {15,5,6,4,8,2};

        System.out.println(findEqualSumNewPreSuf(arr));

        System.out.println(findEqualSumNewPre(arr));
        System.out.println(findEqualSum(arr));
    }

    private static boolean findEqualSum(int[] arr) {
        int totalSum = findArrSum(arr);
        int prefixSum = 0;

        for (int i = 0;i<arr.length;i++){
            prefixSum +=arr[i];
            int sufixSum = totalSum - prefixSum;
            if (prefixSum == sufixSum){
                return true;
            }
        }
        return false;
    }

    private static boolean findEqualSumNewPre(int[] arr) {
        long [] prefixArr = new  long[arr.length];

        prefixArr[0] = arr[0];
        for (int i =1; i <arr.length;i++){
            prefixArr[i] = prefixArr[i-1]+ arr[i];
        }

        int totalSum = findArrSum(arr);
        for (int j =0; j<arr.length-1;j++){
            long sufixSum = totalSum - prefixArr[j];
            if (prefixArr[j] == sufixSum){
                return true;
            }
        }


        return false;
    }

    private static int findArrSum(int[] arr) {
        int totalSum = 0;
        for (int i =0;i<arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }


    private static boolean findEqualSumNewPreSuf(int[] arr) {
        long [] prefixArray = new long[arr.length];
        long[] sufixArray = new long[arr.length];

        prefixArray[0] = arr[0];
        for (int i = 1;i<arr.length; i++){
            prefixArray[i] = prefixArray[i-1]+arr[i];
        }

        sufixArray[arr.length -1]=arr[arr.length -1];
        for (int j = arr.length-2;j>=0;j--){
            sufixArray[j] = arr[j]+sufixArray[j+1];
        }

        System.out.println(Arrays.toString(prefixArray));
        System.out.println(Arrays.toString(sufixArray));

        for (int i =0; i < prefixArray.length-1; i ++){
            if (prefixArray[i] == sufixArray[i+1]){
                return true;
            }
        }
       return false;
    }
}
