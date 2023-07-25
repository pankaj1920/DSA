package dsa.leetcode.medium;

// https://leetcode.com/problems/maximum-subarray/
public class QA_53_Maximum_Subarray {
    public static void main(String[] args) {
        int nums[] = {5, 4, -1, 7, 8};

        System.out.println(getLargestSum(nums));
    }

    private static int getLargestSum(int nums[]) {

        int largestSum = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
            }
        }
        return largestSum;
    }
}
