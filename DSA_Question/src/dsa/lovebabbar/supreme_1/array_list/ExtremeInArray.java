package dsa.lovebabbar.supreme_1.array_list;

public class ExtremeInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        getExtremeArray(nums);
    }

    private static void getExtremeArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            System.out.print(nums[start] + " ");
            System.out.print(nums[end] + " ");
            start++;
            end--;
        }

    }
}
