
package oops;

class Person {
    String name = "Priya";
    int age = 30;
}

class Employee extends Person {
    int empId = 201;
    int salary = 50000;
}

class Manager extends Employee {
    String department = "IT";
}

public class MultiLevelInherit {
    public static void main(String[] args) {
        Manager m = new Manager();

        System.out.println("Name: " + m.name);
        System.out.println("Age: " + m.age);
        System.out.println("Employee ID: " + m.empId);
        System.out.println("Salary: " + m.salary);
        System.out.println("Department: " + m.department);
    }
}
