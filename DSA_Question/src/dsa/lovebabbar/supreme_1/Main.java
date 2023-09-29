package dsa.lovebabbar.supreme_1;

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    int N;
    String  accountInfo;

     Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();
        accountInfo = sc.nextLine();
        System.out.println("N "+N);
        System.out.println("accountInfo "+accountInfo);
        String a[] = accountInfo.split(" ");
        int Type = Integer.parseInt(a[0]);
        int X = Integer.parseInt(a[1]);

        if(Type == 1){
            System.out.println(N+X);
        }else{
            if(X>N){
                System.out.println("Insufficient Funds");
            }else{
                System.out.println(N - X);
            }
        }

        
    }
}