package dsa.lovebabbar.supreme_2.recurssion;

public class PowerOfTwo {
    public static void main(String[] args) {

        int po = 5;

        System.out.println(findPow(po));
    }

    private static int findPow(int po) {
        if (po ==0){
            return 1;
        }

        return  2*findPow(po-1);
    }
}
