package Oct_29;
import java.util.*;

public class TreeSetExample{
    public static void main(String args[]) {

        TreeSet<Integer> numbers = new TreeSet<Integer>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);

        System.out.println("TreeSet elements:");

        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}