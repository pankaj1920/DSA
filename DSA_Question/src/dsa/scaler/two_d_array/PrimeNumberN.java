package dsa.scaler.two_d_array;

public class PrimeNumberN {
    public static void main(String[] args) {

        System.out.println(findCountOfPrime(1));
    }

    private static int findCountOfPrime(int num) {
        int primeCount = 0;

        for (int i = 2;i<=num;i++){
            int factor = findFactor(i);
            if (factor == 2){
                primeCount++;
            }
        }

        return primeCount;
    }

    private static int findFactor(int num) {
        int factorCount =0;
        for (int i=1; i<= num/i;i++){
            if (num%i == 0){
                factorCount+=2;
            }
        }

        return factorCount;
    }
}
