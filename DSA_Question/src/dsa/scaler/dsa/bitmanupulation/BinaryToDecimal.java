package dsa.scaler.dsa.bitmanupulation;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int num = 11001;

        System.out.println(covertToDecimal(num));
    }

    private static int covertToDecimal(int num) {

        int ans =0;
        int sqare = 1;

        while (num>0){
            int lastNum = num%10;
            num = num/10;
            ans = ans+(lastNum*sqare);
            sqare = 2*sqare;
        }

        return ans;
    }
}
