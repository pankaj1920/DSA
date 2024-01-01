package dsa.lovebabbar.supreme_2.recurssion;

import java.util.ArrayList;

public class DigitNumber {
    public static void main(String[] args) {

        int num = 789;
        System.out.println(digitNumArr(num));
    }

    private static ArrayList<Integer> digitNumArr(int num) {

        ArrayList<Integer> digitArray = new ArrayList<>();
        return digitArrayList(num, digitArray);
    }

    private static ArrayList<Integer> digitArrayList(int num, ArrayList<Integer> digitArray) {
        if (num % 10 == num) {
            digitArray.add(num);
            return digitArray;
        }

        int a = num % 10;
        num = num / 10;

        digitArrayList(num, digitArray);

        digitArray.add(a);
        return digitArray;
    }
}
