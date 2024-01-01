package dsa.scaler.dsa.recursion;

public class SumOfNumber {

    public static void main(String[] args) {

        int num = 13542;

        System.out.println(findSumRec(num));
    }

    private static int findSumRec(int num) {
        if (num%10==num){
            return num;
        }

        return (num%10)+findSumRec(num/10);
    }
}
