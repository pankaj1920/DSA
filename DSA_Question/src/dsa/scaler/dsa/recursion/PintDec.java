package dsa.scaler.dsa.recursion;

public class PintDec {
    public static void main(String[] args) {

        printDec(5);
    }

    private static void printDec(int i) {
        if (i ==0){
            return;
        }

        System.out.println(i);
        printDec(i-1);
    }
}
