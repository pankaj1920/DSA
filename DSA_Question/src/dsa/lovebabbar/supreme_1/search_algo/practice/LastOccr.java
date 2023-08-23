package dsa.lovebabbar.supreme_1.search_algo.practice;

public class LastOccr {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 4, 4, 4, 4, 6, 7, 7,9};
        int target = 4;
        int lastAccr = findLastOccur(arr, 7);

        System.out.println(lastAccr);
    }

    private static int findLastOccur(int[] arr, int target) {
        int ans = -1;

        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while(start<=end){

            if (target == arr[mid]){
                ans = mid;
                start = mid+1;
            }else if (target< arr[mid]){
                end = mid -1;
            }else{
                start = mid+1;
            }
            mid = start+(end-start)/2;
        }


        return ans;
    }
}
