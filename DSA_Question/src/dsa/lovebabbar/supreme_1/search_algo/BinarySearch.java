package dsa.lovebabbar.supreme_1.search_algo;

public class BinarySearch {
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10, 12, 16};

        int target = 12;

       int ans=  binarySearch(num, target);
        System.out.println(ans);
    }

    private static int binarySearch(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;
        int mid = start+ ( end - start) / 2;
        int index = -1;

        while (start <= end) {
            if (num[mid] == target) {
               return mid;
            } else if (target < num[mid]) {
                end = mid - 1;
            }else{
                start = mid +1;
            }


            mid = (start + end) / 2;
        }

        return -1;
    }
}
