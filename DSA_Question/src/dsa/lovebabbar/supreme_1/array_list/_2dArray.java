package dsa.lovebabbar.supreme_1.array_list;

public class _2dArray {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        prin2dArray(array);
//        printReverse2dArray(array);

    }

    private static void  printReverse2dArray(int[][] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length -1 ; j >= 0; j--) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    private static void prin2dArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[j][i]);
            }
            System.out.println();
        }
    }


}
