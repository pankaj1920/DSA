package dsa.lovebabbar.supreme_1.search_algo;

public class LastOccurence {
    public static void main (String[] args){
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 4, 4, 4, 6, 7, 9};

        int lastOcc = findLastOccurence(arr,3);
        System.out.println(lastOcc);
    }

    private static int findLastOccurence(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end-start)/2;
        int ans = -1;
        while (start<=end){
            if (target == arr[mid]){
                ans = mid;
                start = mid +1;
            }else if (target<arr[mid]){
                end = mid -1;
            }else{
                start = mid+1;
            }
            mid = start+(end-start)/2;
        }

        return ans;
    }
}
