package dsa.scaler.dsa.bitmanupulation;

public class AddToNumber {
    public static void main(String[] args) {
        int num1 =548;
        int num2 = 398;

        System.out.println(num1+num2);

        System.out.println(addTo(num1,num2));
    }

    private static int addTo(int num1, int num2) {
        int ans =0;
        int multi=1;
        int carry =0;

        while (num1>0||num2>0|| carry>0){
            int lastFistNum = num1%10;
            num1 = num1/10;
            int lastSecondNum = num2%10;
            num2 = num2/10;

            int lastDigitSum = lastFistNum+lastSecondNum;
            int lastDigi = lastDigitSum%10;
        }
        return 0;
    }

}
