package dsa.scaler.dsa.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseTheString {
    public static void main(String[] args) {
        String A = " the   sky  is       blue           ";

        System.out.println(rev(A));
    }

    private static String rev(String a) {
        char[] ch = a.trim().toCharArray();

        System.out.println(Arrays.toString(ch));

        return "";
    }
}
