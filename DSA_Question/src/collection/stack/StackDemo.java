package collection.stack;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack s = new Stack();
        // we can add using add and push method
        s.add("Pankja");
        s.push("101");
        s.push(200.20);
        s.add("Suny");

        System.out.println(s);
        // it will remove top most element and also return that element
        System.out.println(s.pop());
        System.out.println(s);
        // it will return top most element but doesnot remove
        System.out.println(s.peek());
    }
}
