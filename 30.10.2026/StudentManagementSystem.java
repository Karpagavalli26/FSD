package Oct_30;

import java.util.*;

class Student {
    int id;
    String name;
    String department;
    int marks;

    Student(int id, String name, String department, int marks) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " " + name + " " + department + " " + marks);
    }
}

public class StudentManagementSystem {
    public static void main(String args[]) {

        ArrayList<Student> students = new ArrayList<>();
        HashSet<Integer> studentIds = new HashSet<>();

        // Adding 5 students
        addStudent(students, studentIds, new Student(101, "Arun", "CSE", 85));
        addStudent(students, studentIds, new Student(102, "Priya", "IT", 92));
        addStudent(students, studentIds, new Student(103, "Kavi", "ECE", 78));
        addStudent(students, studentIds, new Student(104, "Ravi", "CSE", 95));
        addStudent(students, studentIds, new Student(105, "Meena", "IT", 88));

        // Display all students using Iterator
        System.out.println("All Student Records:");
        Iterator<Student> itr = students.iterator();

        while (itr.hasNext()) {
            itr.next().display();
        }

        // Search student using ID
        int searchId = 102;
        System.out.println("\nSearching Student ID: " + searchId);

        if (studentIds.contains(searchId)) {
            for (Student s : students) {
                if (s.id == searchId) {
                    s.display();
                }
            }
        } else {
            System.out.println("Student Not Found");
        }

        // Checking duplicate ID
        int newId = 103;

        if (studentIds.contains(newId)) {
            System.out.println("\nDuplicate ID " + newId + " - Registration Not Allowed");
        }

        // Remove student using ID
        int removeId = 103;

        Iterator<Student> it = students.iterator();

        while (it.hasNext()) {
            Student s = it.next();

            if (s.id == removeId) {
                it.remove();
                studentIds.remove(removeId);
                System.out.println("\nStudent " + removeId + " Deleted Successfully");
                break;
            }
        }

        // Display updated records
        System.out.println("\nUpdated Student Records:");

        for (Student s : students) {
            s.display();
        }

        // Find topper using Collections
        Student topper = Collections.max(students,
                Comparator.comparingInt(s -> s.marks));

        System.out.println("\nTopper Details:");
        topper.display();
    }

    // Method to add student without duplicate ID
    static void addStudent(ArrayList<Student> students,
            HashSet<Integer> studentIds, Student s) {

        if (!studentIds.contains(s.id)) {
            students.add(s);
            studentIds.add(s.id);
        } else {
            System.out.println("Duplicate Student ID Not Allowed");
        }
    }
}