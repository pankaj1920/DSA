package dsa.lovebabbar.supreme_1.star_pattern;

public class square_box {
    public static void main(String[] args) {
        printSquare();
    }

    private static void printSquare() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
