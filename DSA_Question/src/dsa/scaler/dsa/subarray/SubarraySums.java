package dsa.scaler.dsa.subarray;

public class SubarraySums {
    public static void main(String[] args) {
        int[] arr = {10, 27, 12, 25, 24};

        findSumArr3Lo(arr);
        System.out.println();
        findSumArrPriFix(arr);
        System.out.println();
        findSumArrExtraVar(arr);
        System.out.println();
        findSumArrOneLoop(arr);
    }

    private static void findSumArrOneLoop(int[] arr) {
    }

    private static void findSumArrExtraVar(int[] arr) {

        for (int i =0; i<arr.length;i++){

            int sum =0;
            for (int j =i; j<arr.length;j++){
                sum += arr[j];
                System.out.print(sum+" ");
            }
        }
    }

    private static void findSumArrPriFix(int[] arr) {
        long[] priFixArr = new long[arr.length];

        priFixArr[0]= arr[0];

        for (int i =1; i<arr.length; i++){
            priFixArr[i]= priFixArr[i-1]+arr[i];
        }

        for (int j =0; j<arr.length;j++){

            for (int k =j; k<arr.length;k++){

                if (j==0){
                    System.out.print(priFixArr[k]+" ");
                }else{

                    System.out.print(priFixArr[k]-priFixArr[j-1]+ " ");
                }
            }
        }

    }

    private static void findSumArr3Lo(int[] arr) {
        for (int i=0;i< arr.length;i++){
            for (int j =i; j<arr.length;j++){
                int sum =0;
                for (int k =i;k<=j;k++){
                    sum += arr[k];
                }
                System.out.print(sum +" ");
            }
        }
    }
}
