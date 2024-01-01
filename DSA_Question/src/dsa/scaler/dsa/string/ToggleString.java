package dsa.scaler.dsa.string;

public class ToggleString {
    public static void main(String[] args) {
        String strValue = "ScAlEr";

        System.out.println(changeStr(strValue));
        System.out.println();
        System.out.println(toggleStr(strValue));
    }

    private static String toggleStr(String strValue) {

        String output = "";
        for (int i = 0; i < strValue.length(); i++) {
            char word = strValue.charAt(i);
            char c;
            if (word >= 'A' && word <= 'Z') {
                c = (char) (word + 32);
            } else {
                c = (char) (word - 32);
            }
            output += c;
        }

        return output;
    }

    private static String changeStr(String strValue) {

        String output = "";
        for (int i =0; i<strValue.length(); i++){

            char word = strValue.charAt(i);
            char c;
            if (word>='A' && word<= 'Z'){
                 c = (char)(word- 'A'+'a');
            }else {

                c = (char) (word - 'a'+'A');

            }
            output+=c;

        }

        return output;
    }
}
