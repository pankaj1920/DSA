package dsa.scaler.dsa.carry_forward;

public class LeaderInArrBrut {

    public static void main(String[] args) {
        int[] arr = {3,2,4,5,2,7,-1,15};

        System.out.println(findLeaderBrut(arr));
    }

    private static int findLeaderBrut(int[] arr) {
        int numberOfLeader =1;
        int maxNumber = arr[0];

        for (int i =1;i<arr.length;i++){

            if (arr[i]>maxNumber){
                numberOfLeader++;
                maxNumber =arr[i];
            }


        }
        return numberOfLeader;
    }
}
