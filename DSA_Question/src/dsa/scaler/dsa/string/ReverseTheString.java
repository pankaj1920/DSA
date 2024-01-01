package dsa.scaler.dsa.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseTheString {
    public static void main(String[] args) {
        String A = " the   sky  is       blue           ";

        System.out.println(rev(A));
    }

    private static String rev(String a) {

        String[] abc = a.split(" ");
//        System.out.println(Arrays.toString(abc));

        StringBuilder sb = new StringBuilder();

        for (int i = abc.length - 1; i >= 0; i--) {
            if (!abc[i].equals("")) {
                sb.append(abc[i]).append(" ");
            }
        }

        return sb.toString().trim();
    }
}
