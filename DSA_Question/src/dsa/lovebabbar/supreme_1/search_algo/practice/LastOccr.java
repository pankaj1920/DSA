package dsa.lovebabbar.supreme_1.search_algo.practice;

public class LastOccr {
    public static void main (String[] args){
        int[] arr = {1, 3, 4, 4, 4, 4, 4, 6, 7, 9};
        int target = 4;
        int lastAccr = findLastOccur(arr,target);
    }

    private static int findLastOccur(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        int mid = start+(end - start)/2;
        while (start<=end){
            if (target==arr[mid]){
                start = mid +1;
            }else if (target< arr[mid]){
                mid = end-1;
            }else{
                mid = start+1;
            }
            mid = start +(end-start)/2;
        }
    }
}
