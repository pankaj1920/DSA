package dsa.scaler.dsa.carry_forward;

public class SpecialCharacterSequence {
    public static void main(String[] args) {
        String  A = "GAB";

        System.out.println(finCharSeqNo(A));
    }

    private static int finCharSeqNo(String a) {

        int seq = 0;
        int GCOUNT = 0;

        for (int i = a.length() -1;i>=0;i--){

            char chara = a.charAt(i);

            if (chara == 'G'){
                GCOUNT++;
            }

            if (chara == 'A'){
                seq +=GCOUNT;
            }
        }

        return seq;
    }
}
