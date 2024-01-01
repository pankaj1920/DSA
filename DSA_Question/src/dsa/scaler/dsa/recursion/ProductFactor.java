package dsa.scaler.dsa.recursion;

public class ProductFactor {
    public static void main(String[] args) {
        System.out.println(findProdFact(5));
    }

    private static int findProdFact(int i) {
        if (i ==1){
            return 1;
        }

        return i*findProdFact(i-1);
    }
}
