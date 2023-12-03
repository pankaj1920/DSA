package dsa.scaler.dsa.carry_forward;

public class FindAGOptm {
    public static void main(String[] args) {
        String[] arr = {"a","c","g","d","g","a","g"};

        System.out.println(findAgPariOptm(arr));

    }

    private static int findAgPariOptm(String[] arr) {
        int n = arr.length;
        int noOfG =0;
        int pair =0;

        for (int i = n-1; i>=0;i--){

            if (arr[i].equals("g")){
                noOfG++;
            }

            if (arr[i].equals("a")){
                pair= pair+noOfG;
            }
        }

        return pair;
    }


}
