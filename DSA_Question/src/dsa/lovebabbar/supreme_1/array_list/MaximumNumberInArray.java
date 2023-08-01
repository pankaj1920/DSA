package dsa.lovebabbar.supreme_1.array_list;

public class MaximumNumberInArray {

    public static void main(String[] args){
        int[] num = {2,4,1,6,8,9,80};
        System.out.println(getMaxNumber(num));
    }

    private static int getMaxNumber(int[] num){
        int maxNum = num[0];
        for (int i =0; i < num.length;i++){
            if (num[i] > maxNum){
                maxNum = num[i];
            }
        }
        return maxNum;
    }
}
