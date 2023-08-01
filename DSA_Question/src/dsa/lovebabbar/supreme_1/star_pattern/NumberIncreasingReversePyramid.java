package dsa.lovebabbar.supreme_1.star_pattern;

public class NumberIncreasingReversePyramid {
    public static void main(String[] args) {
        printStar(6);
    }

    private static void printStar(int num) {
        for(int row =0; row<num;row++){
            for(int col=0;col<(num-row);col++){
                System.out.print(col+1+" ");
            }
            System.out.println("");
        }

    }
}
