package dsa.lovebabbar.supreme_1.star_pattern;

public class NumberChangingPyramid {
    public static void main(String[] args) {
        printStar(4);
    }

    private static void printStar(int num) {
        int value = 1;
        for (int row =0;row<num;row++){
            for (int col = 0;col<=row;col++){
                System.out.print(value+" ");
                value++;
            }
            System.out.println("");
        }
    }
}
