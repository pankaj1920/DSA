package dsa.kunal.recurcion;

public class Print1_N {

    public static void main(String[] args) {

        sovle(9);
    }

    private static void sovle(int i) {

        if ( i ==1){
            System.out.println(1);
            return;
        }

        sovle(i-1);
        System.out.println(i);
    }
}
