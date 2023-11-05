package dsa.scaler.test;

public class Question3 {

    public static void main(String[] args) {
        String s = "abc";

        System.out.println(findSum(s));
    }

    private static int findSum(String s) {

        int ans = 0;
        for (int i =0;i<s.length();i++){
            int asc = s.charAt(i);
            ans = ans+ asc;
        }
        return ans;
    }
}
