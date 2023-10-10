package dsa.scaler.array;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {

    }
    public void solve(ArrayList<ArrayList<Integer>> A, int B) {
        int sum = 0;

        for(int i =0;i<A.get(B).size();i++) {

            sum = sum+ A.get(i).get(B);
        }
    }

}
