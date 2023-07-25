package collection.list_and_set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        //List is Index based data structure
        List l = new ArrayList();

        l.add(10);
        l.add(1,20);
        //List me hum duplicte item store kr sakte hai
        l.add(30);
        l.add(30);
        l.add(3,40);

        // jis order me item add hai ussi order me print honge. list insertion order ko follow krta hai
        System.out.println(l);

       Iterator  iterator=  l.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }

       ListIterator listIterator= l.listIterator();
        listIterator.hasNext();
        listIterator.hasPrevious();
    }
}
