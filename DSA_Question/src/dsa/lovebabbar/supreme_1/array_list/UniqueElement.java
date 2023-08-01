package dsa.lovebabbar.supreme_1.array_list;

public class UniqueElement {
    public static void main(String[] args){
        int nums[] = {1,2,4,2,1,3,6,5,5,6,4};
        System.out.println("Unique element is "+findUniqueElement(nums));
    }

    public static int findUniqueElement(int[] nums){

        int ans = 0;

        for (int i = 0;i<nums.length;i++){
            ans = ans^nums[i];
        }

        return  ans;
    }
}
