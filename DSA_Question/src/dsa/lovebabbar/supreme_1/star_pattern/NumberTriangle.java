package dsa.lovebabbar.supreme_1.star_pattern;

public class NumberTriangle {
    public static void main(String[] args){
        printStar(9);
    }

    public static void printStar(int num){
        for (int row =0;row<num;row++){
            for(int col =0;col<num;col++){
                if (col >= (num-row)){
                    System.out.print(row+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
