package dsa.scaler.test;

public class Question5 {
    public static void main(String[] args) {
        int[][] A = {{10,20,30},{15,25,35},{27,17,22}}; // 50

        System.out.println(findMinMaxSum(A));
    }

    private static int findMinMaxSum(int[][] a) {
        int result =0;
        int rowLength= a.length;
        int colLength = a[0].length;


        for (int row =0;row<rowLength;row++){
            int min = a[row][0]; int max = a[row][0];

            for (int col =0;col<colLength;col++){//27,17,22
                if ( a[row][col] < min){
                    min = a[row][col];
                }else if ( a[row][col] > max){
                    max = a[row][col];
                }
            }
            System.out.println(min + " "+ max);
            result = result+ (max-min);
        }
        return result;
    }
}
