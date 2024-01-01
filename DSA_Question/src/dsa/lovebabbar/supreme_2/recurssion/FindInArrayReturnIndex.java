package dsa.lovebabbar.supreme_2.recurssion;

public class FindInArrayReturnIndex {
    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50,60,70,80};

        int index = 0;
        int target = 10;
        System.out.println(findInArr(arr,index,target));
    }

    private static int findInArr(int[] arr,int index,int target) {

        if (index>=arr.length){
            return  -1;
        }

        if (arr[index] == target){
            return index;
        }

        return findInArr(arr, index+1, target);

    }
}
