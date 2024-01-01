package dsa.lovebabbar.supreme_2.recurssion;

public class Fibo {
    public static void main(String[] args) {

        System.out.println(findFibo(4));
    }

    private static int findFibo(int i) {
        if (i==0){
            return 0;
        }

        if (i ==1){
            return 1;
        }

        return findFibo(i-1)+findFibo(i-2);
    }
}
