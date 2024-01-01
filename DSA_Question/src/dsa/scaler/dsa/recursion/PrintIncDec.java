package dsa.scaler.dsa.recursion;

public class PrintIncDec {
    public static void main(String[] args) {

        printIncDec(5);
    }

    private static void printIncDec(int i) {

        if (i==0){
            return;
        }

        System.out.println(i);
        printIncDec(i-1);
        System.out.println(i);;
    }
}
