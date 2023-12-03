package dsa.scaler.dsa.string;

public class ToggleCase {
    public static void main(String[] args) {
        String A = "Hello";

        System.out.println(toggleCase(A));
    }

    private static String toggleCase(String a) {

        StringBuilder togString = new StringBuilder();

        for (int i=0; i<a.length();i++){

            char charWord = a.charAt(i);

            if (charWord >= 'A' && charWord<='Z'){
                char ab = (char) (charWord + 32);
                togString.append(ab);
            }else{
                char kb = (char) (charWord - 32);
                togString.append(kb);
            }
        }

        return togString.toString();
    }
}
