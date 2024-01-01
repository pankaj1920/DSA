package dsa.scaler;

public class MaxIng {
    public static void main(String[] args) {
        int[] arr = {3,2 ,-1,2};

        System.out.println(findDec(arr));
    }

    private static long findDec(int[] arr) {
        if (arr.length == 1){
            return arr[0];
        }

        long[] preSum = new long[arr.length];

        preSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            preSum[i] = preSum[i - 1] + arr[i];
        }

        int startIndex = 0;
        int endIndex = 0;

        int maxNumber = arr[0];


        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > maxNumber) {
                startIndex = j;
            }
        }

        int minNumber = arr[arr.length -1];

        for (int k = arr.length -1; k < startIndex; k--) {
                if (arr[k]<minNumber){
                    
                }
        }
        System.out.println("start "+startIndex + " end "+endIndex);
        if (startIndex == 0&& endIndex == arr.length -1){
            return preSum[arr.length -1];
        }
       return preSum[endIndex]- preSum[startIndex-1];

    }
}
