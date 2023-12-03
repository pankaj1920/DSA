package dsa.scaler.dsa.carry_forward;

public class FindAGBruteForce {
    public static void main(String[] args) {
        String[] arr = {"a","c","g","d","g","a","g"};

        System.out.println(findAgPariBF(arr));

    }

    private static int findAgPariBF(String[] arr) {

        int totalAg = 0;
        for (int i =0; i <arr.length; i++){
            if (arr[i].equals("a")){
                for (int j =i+1; j<arr.length;j++){
                    if (arr[j].equals("g")){
                        totalAg++;
                    }
                }
            }

        }
        return totalAg;
    }
}
