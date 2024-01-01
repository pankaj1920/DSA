package dsa.lovebabbar.supreme_2.recurssion;

public class PrintNumber {
    public static void main(String[] args) {

        int number = 789;

        printNum(number);
    }

    private static void printNum(int number) {

        if (number % 10 == number){
            System.out.println(number);
            return;
        }
        int a = number%10;
        number = number/10;

        printNum(number);

        System.out.println(a);
    }
}
