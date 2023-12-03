package dsa.scaler.dsa.carry_forward;

import java.util.ArrayList;
import java.util.Arrays;

public class LeaderFromRight {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(findLead(arr)));
    }

    private static int[] findLead(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        int maxNum = Integer.MIN_VALUE;
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i]>maxNum){
                maxNum = arr[i];
               ans.add(arr[i]);
            }
        }

        int[] outputArr = new int[ans.size()];

        for (int j =0 ; j< ans.size();j++){
            outputArr[j] = ans.get(j);
        }

        return outputArr;
    }
}
