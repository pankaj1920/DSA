package dsa.lovebabbar.supreme_2.recurssion;

public class ReverseNumber {
    public static void main(String[] args) {

        int num = 12345;

        int revNum = 0;
        System.out.println(reverseNum(num,revNum));
    }

    private static int reverseNum(int num,int totlaNum) {

        if (num%10 == num){
            totlaNum = totlaNum+num;
            return totlaNum;
        }

        int lastNum = num%10;
        int n = lastNum*10;
        totlaNum = n+totlaNum;
        num = num/10;

       return reverseNum(num,totlaNum);


    }
}
