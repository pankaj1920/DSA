package dsa.lovebabbar.supreme_2.recurssion;

public class Permutation {
    public static void main(String[] args) {

        String str = "abc";
        int index =0;

        findAllPermutation(str.toCharArray(),index);
    }

    private static void findAllPermutation(char[] str, int index) {
        if (index>= str.length){
            System.out.println(String.valueOf(str));
            return;
        }

        for (int j = index; j < str.length; j++) {

                char temp = str[index];
                str[index] = str[j];
                str[j]= temp;
            findAllPermutation(str,index+1);

        }
    }





}
