package dsa.lovebabbar.supreme_2.recurssion;

import java.util.ArrayList;

public class OccurenceIndex {
    public static void main(String[] args) {

        int [] arr = {10,20,90,10,10,40,30,10};

        int index =0;
        int traget =10;

        System.out.println(occurIndex(arr,index,traget));
    }

    private static ArrayList<Integer> occurIndex(int[] arr, int index, int traget) {

        ArrayList<Integer> occurList = new ArrayList<>();

        return occurListInd(arr,index,traget,occurList);
    }

    private static ArrayList<Integer> occurListInd(int[] arr, int index, int traget, ArrayList<Integer> occurList) {

        if (index >= arr.length){
            return occurList;
        }

        if (arr[index] == traget){
            occurList.add(index);
        }

        return occurListInd(arr, index+1, traget, occurList);
    }
}
