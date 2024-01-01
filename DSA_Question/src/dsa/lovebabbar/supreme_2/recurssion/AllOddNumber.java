package dsa.lovebabbar.supreme_2.recurssion;

import java.util.ArrayList;

public class AllOddNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int index = 0;

        System.out.println(allOddNum(arr, index));
    }

    private static ArrayList<Integer> allOddNum(int[] arr, int index) {

        ArrayList<Integer> oddList = new ArrayList<>();

        return addAllOdd(arr, index, oddList);
    }

    private static ArrayList<Integer> addAllOdd(int[] arr, int index, ArrayList<Integer> oddList) {

        if (index >= arr.length) {
            return oddList;
        }

        if (arr[index] % 2 != 0) {
            oddList.add(arr[index]);
        }

        return addAllOdd(arr, index + 1, oddList);
    }
}
