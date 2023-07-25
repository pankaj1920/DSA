package collection.list_and_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        //set is not Index based data structure
        Set s = new HashSet();
        s.add(100);
        s.add(200);
        s.add(300);

        // set me hum duplicate item store nhi kr sakte hai. ek hi value store hogi
        s.add(400);
        s.add(400);

        // jis order me item add hai ussi order me print nhi honge. set insertion order ko follow nhi krta hai
        System.out.println(s);

        Iterator iterator=  s.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
