package dsa.striver.basic.basic_math;

public class CountDigits {
    public static void main(String[] args) {

        System.out.println(count1(123456));
        System.out.println(count2(123456));
    }



    public static int count1(int n) {
        int x = n; int count =0;
        while( x!=0 )
        {
            x = x / 10;
            count++;
        }

        return count;
    }

    public static int count2(int n){
            return String.valueOf(n).length();
    }
}

