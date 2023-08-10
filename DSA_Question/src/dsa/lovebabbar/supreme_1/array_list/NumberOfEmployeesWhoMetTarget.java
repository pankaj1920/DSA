package dsa.lovebabbar.supreme_1.array_list;

//https://leetcode.com/problems/number-of-employees-who-met-the-target/
public class NumberOfEmployeesWhoMetTarget {
    public static void main(String[] args) {

        int hours[] ={0,1,2,3,4};
        System.out.println( numberOfEmployeesWhoMetTarget(hours,2));

    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int achivedTarge =0;
        for (int hour:hours) {
            if (hour>=target){
                achivedTarge++;
            }
        }
        return achivedTarge;
    }
}
