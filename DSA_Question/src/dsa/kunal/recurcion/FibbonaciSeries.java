package dsa.kunal.recurcion;

public class FibbonaciSeries {

    public static void main(String[] args) {
        int num =6;

        System.out.println(findFibo(num));
    }

    private static int findFibo(int num) {

      if (num<2){
          return num;
      }


        return findFibo(num-1)+findFibo(num-2);
    }
}
