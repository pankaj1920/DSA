package dsa.scaler.dsa.string;

public class LongestPlandrome {
    public static void main(String[] args) {
        String A ="feacabacabgf";

        System.out.println(findLongPalCount(A));
    }

    private static int findLongPalCount(String a) {
        int count =0;

        char [] ch = a.toCharArray();

        int start =0;
        int end = a.length() -1;

        while (start < end){

            if (ch[start] == ch[end]){
               count = count +2;
            }else{
                count =0;
            }

            start++;
            end--;
        }



        return count-1;

    }
}
