package dsa.lovebabbar.supreme_1.search_algo;

public class FindTotalOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 4, 4, 4, 6, 7, 9};
        int target = 4;
        int firstOcr = findFirstOccurence(arr, target);
        int lastOcr = findLastOccurence(arr, target);
        int totalOcr = (firstOcr - lastOcr) + 1;
        System.out.println("Total Occurence " + totalOcr);
    }

    private static int findLastOccurence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (target == arr[mid]) {
                ans = mid;
                end = mid - 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }

        return ans;
    }

    private static int findFirstOccurence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        int ans = -1;

        while (start <= end) {

            if (target == arr[mid]) {
                ans = mid;
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }

        return ans;
    }
}
