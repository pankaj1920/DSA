package dsa.lovebabbar.supreme_1.star_pattern;

public class NumberIncreasingPyramid {
    public static void main(String[] args) {
        printStar(6);
        printStar(6);
    }

    private static void printStar(int num) {

        for (int row = 0;row<num;row++){
            for (int col =0;col<num;col++){
                if (col<=row){
                    System.out.print(col+1+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    private static void printStar2(int num){
        for (int row = 0;row<num;row++){
            for (int col =0; col<=row;col++){
                System.out.println(col+" ");
            }
            System.out.println("");
        }
    }
}
