package dsa.scaler.dsa.string;

public class Pald {
    public static void main(String[] args) {
        String s = "aaaazaa";

        if (s.length() % 2 == 0) {
            evenPal(s);
        } else {
            oddPal(s);
        }
    }

    private static void oddPal(String s) {
        for (int i = 0; i < s.length(); i++) {
            int p1 = i;
            int p2 = i;

            expandPal(s, p1, p2);
        }
    }

    private static void evenPal(String s) {

        for (int i = 0; i < s.length(); i++) {
            int p1 = i;
            int p2 = i + 1;

            expandPal(s, p1, p2);
        }
    }

    private static String expandPal(String s, int p1, int p2) {
        int start =0;
        int end = s.length();
        while (p1 >=0 && p2< end && s.charAt(p1) == s.charAt(p2)){
            p1--;
            p2++;
        }

        return  "";
    }
}
