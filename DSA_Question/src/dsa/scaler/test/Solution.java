package dsa.scaler.test;

public class Solution {

    public static void main(String[] args) {

        int a[] = {-15,65};
        System.out.println(solve(a));
    }
    public static int solve(int[] A) {
        int product = 1;
         int max = Integer.MIN_VALUE;
        for(int i = 0;i<A.length;i++){
           
            for(int j = i+1;j<A.length;j++){
                product = A[i]*A[j];

                System.out.println(product);
                
                 if(product > max){
                         max = product;
                        }

               
            }
           
            
        }
       
        return max;
        
    }
}