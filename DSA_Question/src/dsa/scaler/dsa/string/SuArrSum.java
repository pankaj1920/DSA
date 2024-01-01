package dsa.scaler.dsa.string;

public class SuArrSum {

    public static void main(String[] args) {
        int[][] K = {{-5,-2,1,13},
                     {-4, 0,3,14},
                     {-3, 2,6,18}};

        int ans = -3;

        System.out.println(isValPresent(K,ans));
    }

    private static boolean isValPresent(int[][] arr, int ans) {

        int row = arr.length;
        int col = arr[0].length;
        int i = 0;
        int j = col-1;

        while (i< row && j>=0){

            if (arr[i][j]> ans){
                j--;
            }else if (arr[i][j]<ans){
               i++;
            }else {
                return true;

            }


        }


        return false;
    }
}
