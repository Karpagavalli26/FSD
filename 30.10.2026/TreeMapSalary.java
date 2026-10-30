package Oct_30;

import java.util.*;

public class TreeMapSalary {
    public static void main(String args[]) {

        TreeMap<String, Integer> salary = new TreeMap<>();

        salary.put("Kavi", 25000);
        salary.put("Arun", 30000);
        salary.put("Priya", 28000);
        salary.put("Ravi", 35000);

        System.out.println("Employee Salaries:");

        for (String name : salary.keySet()) {
            System.out.println(name + " : " + salary.get(name));
        }
    }
}