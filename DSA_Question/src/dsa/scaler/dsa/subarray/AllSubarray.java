package dsa.scaler.dsa.subarray;

public class AllSubarray {
    public static void main(String[] args) {

        int[] arr = {18, 14, 10, 14};

        printAllSub3Loop(arr);


    }

    private static void printAllSub3Loop(int[] arr) {
        for (int i =0; i< arr.length;i++){
            for (int j=i;j< arr.length;j++){
                for (int k=i; k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }

        }
    }
}
