package dsa.lovebabbar.supreme_2.recurssion;

public class MaxiumCut {
    public static void main(String[] args) {

        System.out.println(maximizeCuts(5,5,3,2));
    }

    public static int maximizeCuts(int n, int x, int y, int z)
    {

        if (n ==0){
            return 0;
        }

        if (n<0){
            return Integer.MIN_VALUE;
        }

        int xCut = 1+maximizeCuts(n-x,x,y,z);
        int yCut = 1+ maximizeCuts(n-y,x,y,z);
        int zCut = 1+maximizeCuts(n-z,x,y,z);

        return Math.max(xCut,Math.max(yCut,zCut));
    }
}
