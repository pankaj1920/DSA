package dsa.kunal.recurcion;

public class PrintNNaturalNumber {

    public static void main(String[] args) {

        int N =1;

        printNumber(N);
    }

    private static void printNumber(int n) {

        if (n == 5){
            System.out.println(n);
            return;
        }

        printNumber(n+1);
        System.out.println(n);
    }
}
