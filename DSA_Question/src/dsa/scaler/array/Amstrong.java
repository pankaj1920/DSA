package dsa.scaler.array;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i =1 ;i<=N;i++){
            int num =i;
            int totalSum = 0;
            int lastDigit = 0;
            while(num!=0){
                lastDigit = num%10;
                totalSum = totalSum+(lastDigit*lastDigit*lastDigit);
                num = num/10;

            }

            if(i == totalSum){
                System.out.println(i);
            }
        }

    }



}
