package dsa.scaler.dsa.string;

public class LongPalindrm {

    public static void main(String[] args) {
        String strValue = "abcbakd";
//        String strValue = "abcdc";

        largestPali(strValue);
        System.out.println();
        largPlaidrom(strValue);

    }

    private static void largPlaidrom(String strValue) {

        int ans = 0;

        for (int i = 0; i < strValue.length(); i++) {

            int left = i;
            int right = i;

          int len =  expandCheckPlaid(strValue, left, right);

          ans = Math.max(ans,len);
        }

        System.out.println(ans);
    }

    private static int expandCheckPlaid(String strValue, int left, int right) {
        int length =0;
        while (left >= 0 && right < strValue.length() - 1 && strValue.charAt(left) == strValue.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }

    private static void largestPali(String strValue) {

        int maxPal = 0;

        for (int i = 0; i < strValue.length(); i++) {

            String abc = "";

            for (int j = i; j < strValue.length(); j++) {

                abc += String.valueOf(strValue.charAt(j));

                if (isPal(abc)) {
                    maxPal = Math.max(maxPal, abc.length());
                }
            }
        }

        System.out.println(maxPal);
    }

    private static boolean isPal(String abc) {

        int start = 0;
        int end = abc.length() - 1;

        while (start <= end) {


            if (abc.charAt(start) != abc.charAt(end)) {

                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
