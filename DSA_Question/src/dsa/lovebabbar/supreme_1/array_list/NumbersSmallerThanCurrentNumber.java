package dsa.lovebabbar.supreme_1.array_list;

import java.util.Arrays;

public class NumbersSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int nums[] = {8,1,2,2,3};

        System.out.println(Arrays.toString(findSmallerNumber(nums)));

    }

    private static int[] findSmallerNumber(int[] nums) {
        int smallerArray[] = new int[nums.length];
        int maxSmaller  = 0;
        for (int i = 0;i <nums.length;i++){
            for (int j=0;j< nums.length;j++){
                if (nums[j]<nums[i]){
                    maxSmaller++;
                }

            }
            smallerArray[i] = maxSmaller;
            maxSmaller = 0;
        }

        return smallerArray;
    }
}
