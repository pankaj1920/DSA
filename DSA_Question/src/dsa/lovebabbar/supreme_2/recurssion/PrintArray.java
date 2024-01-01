package dsa.lovebabbar.supreme_2.recurssion;

public class PrintArray {
    public static void main(String[] args) {
         int arr[] = {1,2,3,4,5,6,7,8};


         printArr(arr,0);
    }

    private static void printArr(int[] arr,int index) {

        if (index >= arr.length){
            return;
        }

        System.out.print(arr[index] + " ");

        printArr(arr,index+1);
    }
}
