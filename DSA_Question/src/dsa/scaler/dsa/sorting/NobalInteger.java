package dsa.scaler.dsa.sorting;

import javax.swing.*;
import java.util.Arrays;

public class NobalInteger {
    public static void main(String[] args) {
        int[] arr = {-1, -5, 3, 5, -10, 4};

        System.out.println(findNobleIntegerBtf(arr));
        System.out.println(findNobleIntegerSort(arr));
    }

    private static int findNobleIntegerSort(int[] arr) {
        int ans = 0;
        Arrays.sort(arr);

        int less = 0;
        if (arr[0] == 0) {
            ans++;
        }

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i-1]){
                less = i;
            }

            if (arr[i] == less){
                ans++;
            }
        }
        return ans;
    }

    private static int findNobleIntegerBtf(int[] arr) {
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    count++;
                }
            }

            if (count == arr[i]) {
                ans++;
            }
        }
        return ans;
    }
}
