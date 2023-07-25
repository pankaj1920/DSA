package collection.tree_set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

      /*  treeSet.add(40);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(60);
        treeSet.add(80);*/
        treeSet.add("deepak");
        treeSet.add("amit");
        treeSet.add("rahul");
        treeSet.add("deepash");
        treeSet.add("kamak");

        // it will print data in sorted order
        System.out.println(treeSet);
    }
}
