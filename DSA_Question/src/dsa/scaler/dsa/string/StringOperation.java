package dsa.scaler.dsa.string;

public class StringOperation {
    public static void main(String[] args) {
        String A="gmylxRVcgkqXfoskRPgpvtopifzMeekxtgsdoxcJvayolblrPaialVOuHsbOsinJeNKfxriklNogrDuIJazSmafuAoZlrasezFLivvrlgwumruomKuxOBaeUeslGgjznVgeszZjcbmMZbyDuSumcJEHscundsNVmaeupsczmcLguDbWuRoDyybauxOhwuqnFvqrpolxuiorwaugPuxnJwXNnLqutojiSZnkaroOkZUwfeirgBeJGxbRhcixBGcCczosShOfjupWirxfUvOqdejicSuuRStEuacdzikjFzizfUdhjJlpAcOWttcFeyhixVZdhYoMctouqqWkxyDaSoeWBxhfgqknxQizcHTyuuervafashDhsbjuNREKorbsJoPnFciw";

        strOper(A);

    }

    private static void strOper(String a) {

        String word = a+a;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i< word.length(); i++){
            if (checkVowel(word.charAt(i))){
                sb.append("#");
            }else if (!isUprCase(word.charAt(i))){
                sb.append(word.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }

    private static boolean isUprCase(char c) {

        return (c >= 'A' && c<= 'Z');
    }

    private static boolean checkVowel(char c) {
        return  (c == 'a' || c == 'e' || c == 'i' || c== 'o');
    }
}
