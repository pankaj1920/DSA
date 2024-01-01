package dsa.scaler.dsa.recursion;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println(reversNumRess(12345));
    }

    private static int reversNumRess(int i) {

        if (i%10 ==i) {
            return i;
        }



        int sum = i+ reversNumRess(i%10)*10;

        System.out.println(sum);

        return reversNumRess(i/10);

    }
}
