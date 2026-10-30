package Oct_29;

import java.util.*;

public class LinkedHashSett{
    public static void main(String args[]) {

        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<Integer>();

        linkedSet.add(10);
        linkedSet.add(20);
        linkedSet.add(30);
        linkedSet.add(40);
        linkedSet.add(50);

        System.out.println("LinkedHashSet: " + linkedSet);

        System.out.println("First element: " + linkedSet.iterator().next());

        System.out.println("Is 30 present? " + linkedSet.contains(30));

        System.out.println("Is 60 present? " + linkedSet.contains(60));

        System.out.println("Total elements: " + linkedSet.size());
    }
}