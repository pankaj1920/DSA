package dsa.lovebabbar.supreme_2.recurssion;

public class SearchInArrayOne {
    public static void main(String[] args) {

        int [] arr = {15,69,32,48,72,10,58};

        int target = 48;
        int index =0;

        System.out.println(searchArrOn(arr,target,index));
    }

    private static boolean searchArrOn(int[] arr, int target, int index) {

        if (index>=arr.length){
            return false;
        }

        if (arr[index] == target){
            return true;
        }

     return  searchArrOn(arr,target,index+1);
    }
}
