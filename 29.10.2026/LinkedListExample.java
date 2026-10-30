package Oct_29;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Initial List: " + list);

        list.addFirst("Grapes");
        list.addLast("Cherry");

        System.out.println("After Adding: " + list);

        list.remove("Banana");
        list.removeFirst();

        System.out.println("After Removing: " + list);

        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());

        System.out.println("Contains Mango: " + list.contains("Mango"));
        System.out.println("Size: " + list.size());

        System.out.println("Reverse Order:");
        Iterator<String> itr = list.descendingIterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        list.clear();
        System.out.println("After clear(): " + list);
    }
}