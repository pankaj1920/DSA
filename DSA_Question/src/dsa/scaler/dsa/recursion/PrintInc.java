package dsa.scaler.dsa.recursion;

public class PrintInc {

    public static void main(String[] args) {
        printInc(5);
    }

    private static void printInc(int i) {
        if (i==0){
            return;
        }

        printInc(i-1);
        System.out.println(i);
    }
}
