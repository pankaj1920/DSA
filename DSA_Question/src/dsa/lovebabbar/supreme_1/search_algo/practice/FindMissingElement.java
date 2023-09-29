package dsa.lovebabbar.supreme_1.search_algo.practice;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

if(true)
    System.out.println(1000);
else System.out.println(10);
//        System.out.println(answ);
    }

    private static int findFirstMissing(int[] arr) {
        int ans = -1;
        int start = 0;
        int end= arr.length-1;
        int mid = start+(end - start)/2;
        while (start<end){
            if(arr[mid] == mid+1){
                start = mid+1;
            }else{
                ans = arr[mid];
                end = mid -1;
            }
            mid = start+(end-start)/2;
        }
        return ans-1;
    }
}
