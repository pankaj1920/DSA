package dsa.scaler.dsa.string;

public class Isalnum {

    public static void main(String[] args) {

        char[] A = {'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'};
        int output = 1;

        for (int i = 0; i < A.length; i++) {

            char word = A[i];


            if (word >= '0' && word<='9' ||  word>='A' && word<='Z' || word>='a' && word<= 'z'){
                output  = 1;
            }else {
                output =0;
                break;
            }

            }

        System.out.println(output);
    }
}