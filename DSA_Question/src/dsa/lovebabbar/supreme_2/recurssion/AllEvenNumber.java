package dsa.lovebabbar.supreme_2.recurssion;

import java.util.ArrayList;
import java.util.Arrays;

public class AllEvenNumber {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int index = 0;

        System.out.println(addAllEven(arr,index));
    }

    private static ArrayList<Integer> addAllEven(int[] arr, int index) {

        ArrayList<Integer> evenList = new ArrayList<>();

        return eveListData(arr,index,evenList);
    }

    private static ArrayList<Integer> eveListData(int[] arr, int index, ArrayList<Integer> evenList) {

        if (index>=arr.length){
            return evenList;
        }

        if (arr[index]%2 == 0){
            evenList.add(arr[index]);
        }

        return eveListData(arr,index+1,evenList);
    }
}
