package dsa.lovebabbar.supreme_1.search_algo;

public class FindFirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 4, 4, 4, 4, 6, 7, 9};

        int firstOccr = findFirstOccur2(arr, 4);

        System.out.println(firstOccr);
    }

    private static int findFirstOccur1(int[] arr, int target) {;

        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        int ans = mid;
        while (start <= end) {
            if (target == arr[mid]) {
                ans = mid;
                end = mid -1;

            } else if (target < arr[mid]) {
                end = mid -1;

            }else{
                start = mid +1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    private static int findFirstOccur2(int[] arr,int target) {

        int start = 0;
        int end = arr.length -1;
        int mid = start + (end - start)/2;
        int ans = 0;
         while (start<= end){
             if (target == arr[mid]){

                 if (arr.length > 1 && target == arr[mid -1]){
                     end = mid - 1;
                 }else{

                     return mid ;
                 }
                
             }else if(target<arr[mid]){
                 end = mid -1;
             }else{
                 start = mid +1;
             }

             mid = start + (end - start)/2;
         }
        return ans;
    }
}
