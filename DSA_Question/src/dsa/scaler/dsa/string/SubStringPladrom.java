package dsa.scaler.dsa.string;

public class SubStringPladrom {

    public static void main(String[] args) {

        String str = "anamadamspe";
        String str1 = "feacabacabgf";

        System.out.println(isPlandrome(str, 0, 2));
    }

    private static boolean isPlandrome(String str, int start, int end) {
        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;

        }

        return true;
    }
}
