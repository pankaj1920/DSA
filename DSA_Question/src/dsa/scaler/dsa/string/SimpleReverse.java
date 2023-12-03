package dsa.scaler.dsa.string;

public class SimpleReverse {
    public static void main(String[] args) {
        String A = "scaler";

        System.out.println(reverseStr(A));
    }

    private static String reverseStr(String a) {

       char [] str = a.toCharArray();

       int start =0;
       int end = str.length-1;

       while (start<end){

           char temp = str[start];
           str[start]= str[end];
           str[end]= temp;

           start++;
           end--;
       }

       return new String(str);
    }
}
