package practice;

public class SubArraySum {
    public static void main(String[] args) {
        int arr[] = {2,8,-1,4};

        findAllSubArrSumPri(arr);
    }

    private static void findAllSubArrSumPri(int[] arr) {

        long[] priSum = new long[arr.length];

        priSum[0]= arr[0];

        for (int i =1; i< arr.length; i++){
            priSum[i] = priSum[i-1] + arr[i];
        }


    }
}
