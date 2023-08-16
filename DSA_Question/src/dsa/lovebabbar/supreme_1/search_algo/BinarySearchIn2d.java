package dsa.lovebabbar.supreme_1.search_algo;

public class BinarySearchIn2d {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}};

        int ans[][] = findIn2dArray(arr, 19);

        System.out.println(ans);


    }

    private static int[][] findIn2dArray(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;

        int start = 0;
        int end = row * col - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            int rowIndex = mid / col;
            int colIndex = mid % col;

            if (arr[rowIndex][colIndex] == target) {
                System.out.println("Found at " + rowIndex + " " + colIndex);
                return new int[rowIndex][colIndex];
            }
            if (arr[rowIndex][colIndex] < target) {

                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }

        return new int[-1][-1];
    }
}
