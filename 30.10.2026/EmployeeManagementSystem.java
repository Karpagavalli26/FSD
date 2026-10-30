package Oct_30;

import java.util.*;

class Employee {
    int id;
    String name;
    String department;
    int salary;

    Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + department + " " + salary);
    }
}

public class EmployeeManagementSystem {
    public static void main(String args[]) {

        ArrayList<Employee> employees = new ArrayList<>();

        // HashMap stores Department ID and Department Name
        HashMap<Integer, String> departments = new HashMap<>();

        departments.put(1, "HR");
        departments.put(2, "IT");
        departments.put(3, "Finance");

        // Adding employees
        employees.add(new Employee(101, "Arun", "IT", 35000));
        employees.add(new Employee(102, "Priya", "HR", 30000));
        employees.add(new Employee(103, "Kavi", "Finance", 40000));
        employees.add(new Employee(104, "Ravi", "IT", 50000));
        employees.add(new Employee(105, "Meena", "HR", 45000));

        // Display all employees using Iterator
        System.out.println("All Employee Details:");

        Iterator<Employee> itr = employees.iterator();

        while (itr.hasNext()) {
            itr.next().display();
        }

        // Search employee using ID
        int searchId = 103;
        boolean found = false;

        System.out.println("\nSearching Employee ID: " + searchId);

        for (Employee e : employees) {
            if (e.id == searchId) {
                e.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee Not Found");
        }

        // Remove employee using ID
        int removeId = 102;

        Iterator<Employee> it = employees.iterator();

        while (it.hasNext()) {
            Employee e = it.next();

            if (e.id == removeId) {
                System.out.println("\nDeleted Employee:");
                e.display();
                it.remove();
                break;
            }
        }

        // Department-wise employee display
        System.out.println("\nDepartment-wise Employees:");

        for (int deptId : departments.keySet()) {
            String deptName = departments.get(deptId);

            System.out.println("\nDepartment ID: " + deptId
                    + " - " + deptName);

            for (Employee e : employees) {
                if (e.department.equals(deptName)) {
                    e.display();
                }
            }
        }

        // Check department using containsKey()
        System.out.println("\nDepartment ID 2 Exists: "
                + departments.containsKey(2));

        // Sort employees by salary in ascending order
        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.salary - e2.salary;
            }
        });

        System.out.println("\nEmployees Sorted by Salary:");

        for (Employee e : employees) {
            e.display();
        }

        // Find highest-paid employee
        Employee highest = Collections.max(employees,
                Comparator.comparingInt(e -> e.salary));

        System.out.println("\nHighest Paid Employee:");
        highest.display();
    }
}