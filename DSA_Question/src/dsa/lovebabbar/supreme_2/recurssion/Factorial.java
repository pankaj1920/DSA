package dsa.lovebabbar.supreme_2.recurssion;

class Factorial {

    public static void main(String[] args) {

        int n = 10;

        System.out.println(findFact(n));
    }

    private static int findFact(int n) {

        if (n==1){
            return 1;
        }

        return n*findFact(n-1);
    }
}
