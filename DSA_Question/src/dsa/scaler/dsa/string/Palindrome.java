package dsa.scaler.dsa.string;

public class Palindrome {
    public static void main(String[] args) {

        String A = "anamadamspe";
        int start = 3;
        int end = 7;

        System.out.println(isPlandro(A,start,end));
    }

    private static boolean isPlandro(String a, int start, int end) {
        char[] ch = a.toCharArray();

        boolean isPal =true;
        while (start<end){

            if (ch[start]!=ch[end]){
                isPal = false;
            }

            start++;
            end--;
        }

        return isPal;
    }
}
