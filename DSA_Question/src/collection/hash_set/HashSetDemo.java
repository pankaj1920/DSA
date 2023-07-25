package collection.hash_set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();

        // has set doesnot follow inserstion order and doesnot store dupicate value

        hs.add(10);
        hs.add("Pankaj");
        hs.add(100.50);
        hs.add(10);

        System.out.println(hs);

      Iterator itr = hs.iterator();

      while (itr.hasNext()){
          System.out.println(itr.next());
      }
    }
}
