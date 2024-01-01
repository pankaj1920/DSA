package dsa.scaler.dsa.string;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] A ={"abcdefgh", "aefghijk", "abcefgh"};
//        String[] A ={"abcab", "abc", "abcd"};

        
        String firstString = A[0];
        for (int i =1; i<A.length;i++){
            
           firstString = getLongestPre(firstString,A[i]);
        }

        System.out.println(firstString);
    }

    private static String getLongestPre(String firstString, String secondString) {

        int start = 0;
        String ab = "";

        int n = Math.min(firstString.length(),secondString.length());
        while (start< n){

            if (firstString.charAt(start) == secondString.charAt(start)){
                ab += firstString.charAt(start);
            }else {
                return ab;
            }
            start++;
        }
        return ab;

    }
}
