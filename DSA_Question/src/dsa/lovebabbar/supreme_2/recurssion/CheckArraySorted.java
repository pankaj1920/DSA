package dsa.lovebabbar.supreme_2.recurssion;

public class CheckArraySorted {
    public static void main(String[] args) {
         int [] arr = {10,20,300,400,500};

        System.out.println(checkArraySort(arr));
    }

    private static boolean checkArraySort(int[] arr) {
        int index =1;
        return  chekSort(arr,index);
    }

    private static boolean chekSort(int[] arr, int index) {

        if (index>= arr.length){
            return true;
        }

        if (arr[index]<arr[index-1]){
            return false;
        }
        return chekSort(arr,index+1);
    }
}
