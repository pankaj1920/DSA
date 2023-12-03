package practice;

public class FindAG {
    public static void main(String[] args) {
        String word = "acgdgag";

        int countAG =0;
        int ans =0;

        for (int i = word.length()-1; i>=0;i--){

            if (word.charAt(i) == 'g'){
                countAG++;
            }
            if (word.charAt(i) == 'a'){
                ans= ans+countAG;
            }
        }

        System.out.println(ans);
    }
}
