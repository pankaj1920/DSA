package dsa.lovebabbar.supreme_2.recurssion;

public class RobberHouse {
    public static void main(String[] args) {
        int[] house = {1,2,3,1};

        System.out.println(rob(house));
    }

    public static int rob(int[] nums) {
        int index =0;
        int ans =0;
        return solve(nums,index);
    }

    private static int solve(int[] nums, int index) {
        if (index>= nums.length){
            return 0;
        }

        // chori krlo -> ith index
        int option1= nums[index] + solve(nums,index+2);

        // chori mat krlo -> ith index
        int option2 = 0+solve(nums,index+1);

        return Math.max(option1,option2);

    }
}
