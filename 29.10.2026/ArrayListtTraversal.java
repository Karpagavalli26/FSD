package Oct_29;

import java.util.*;

public class ArrayListtTraversal {
    public static void main(String args[]) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        System.out.println("Reverse Order:");
        ListIterator<String> itr = list.listIterator(list.size());

        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }

        System.out.println("Using For Loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Using Iterator:");
        Iterator<String> i = list.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("Using forEach:");
        list.forEach(a -> System.out.println(a));
    }
}