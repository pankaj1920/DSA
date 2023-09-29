package dsa.lovebabbar.supreme_1.search_algo;

public class FindOneMissingElement {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,9};

        int ans = findMissingElement(arr);
        System.out.println("Missiong number is "+ans);
    }

    private static int findMissingElement(int[] arr) {
        int start =0;
        int end = arr.length -1;
        int mid = start +(end - start)/2;
        int ans = -1;

        while (start<=end){
            if(arr[mid] == mid +1){
                start = mid+1;
            }else{
                ans = arr[mid];
                end = mid -1;
            }

            mid = start+(end - start)/2;
        }

        return ans -1;
    }
}
