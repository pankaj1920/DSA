package practice;

public class FindLeader {
    public static void main(String[] args) {
//        int [] arr = {3,2,4,5,2,7,-1,15};
        int [] arr = {4,2,3,9,7,10};
//        int [] arr = {3,2,4,5,2,7,-1,15};

        int maxNum = arr[0];
        int count = 1;

        for (int i =1; i<arr.length;i++){
            if (arr[i]>maxNum){
                maxNum = arr[i];
                count++;
            }
        }

        System.out.println(count);
    }
}
