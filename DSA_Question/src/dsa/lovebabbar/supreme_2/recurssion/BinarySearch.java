package dsa.lovebabbar.supreme_2.recurssion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 35, 38, 45, 49, 56, 78, 98};
        int target = 11;
        System.out.println(biSearch(arr, target));
    }

    private static int biSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        return searchBin(arr, start, end, target);
    }

    private static int searchBin(int[] arr, int start, int end, int target) {

        int mid = start + (end-start) / 2;
        if (start > end) {
            return -1;
        }

        if (arr[mid] > target) {
            return searchBin(arr, start, mid - 1, target);
        } else if (arr[mid] < target) {
            return searchBin(arr, mid + 1, end, target);
        } else {
            return mid;
        }


    }
}
