package dsa.lovebabbar.supreme_2.recurssion;

public class FindMaxArray {
    public static void main(String[] args) {
        int [] arr = { 15,18,30,26};
        int max = Integer.MIN_VALUE;
        int index =0;

        System.out.println(findMax(arr,max,index));
    }

    private static int findMax(int[] arr, int max, int index) {

        if (index >= arr.length){
            return max;
        }

        if (arr[index]>max){
            max = arr[index];
        }

        return findMax(arr,max,index+1);
    }
}
