package dsa.lovebabbar.supreme_2.recurssion;

public class FindMinInArray {

    public static void main(String[] args) {

        int[] arr = {15,18,31,61,32};

        int min = Integer.MAX_VALUE;
        int index = 0;
        System.out.println(findMin(arr,min,index));
    }

    private static int findMin(int[] arr, int min, int index) {

        if (index>= arr.length){
            return min;
        }

        if (arr[index]<min){
            min = arr[index];
        }

        return findMin(arr, min, index+1);
    }
}
