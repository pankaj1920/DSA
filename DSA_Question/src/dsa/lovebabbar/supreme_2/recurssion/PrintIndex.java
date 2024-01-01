package dsa.lovebabbar.supreme_2.recurssion;

public class PrintIndex {
    public static void main(String[] args) {
        int [] arr = {10,20,90,10,10,40,30,10};

        int index =0;
        int traget =10;

        printOccurIndex(arr,index,traget);

    }

    private static void printOccurIndex(int[] arr, int index, int traget) {

        if (index >= arr.length){
            return;
        }

        if (arr[index] == traget){
            System.out.print(index+" ");
        }

        printOccurIndex(arr, index +1, traget);

    }
}
