package dsa.scaler.dsa.string;

public class MaxZero {

    public static void main(String[] args) {
        int[][] K = {{-0, 1, 1},
                     {0, 0, 1},
                     {0, 1, 1}};


        findMaxRowOne(K);
    }

    private static int findMaxRowOne(int[][] arr) {

        int maxZeroRow =0;

        int row = arr.length;
        int col = arr[0].length;
        int i = 0;
        int j = col - 1;

        int maxOne = 0;

        int count =0;


        while (i < row && j >= 0) {

            if (arr[i][j] == 1){
                j--;
                maxOne++;
            }else{
                i++;
            }
        }

        return maxZeroRow;
    }
}
