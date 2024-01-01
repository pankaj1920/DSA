package dsa.scaler.dsa.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(findFacRes(100));;

    }

    private static int findFacRes(int i) {

        if (i ==0){
            return 0;
        }

        return i+findFacRes(i-1);
    }
}
