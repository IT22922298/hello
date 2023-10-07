package lab06;

import java.util.ArrayList;
import java.util.List;

public class StudentListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store Student objects
        List<Student> studentList = new ArrayList<>();

        // Add Student objects to the ArrayList
        studentList.add(new Student(1, "Alice", 3.8));
        studentList.add(new Student(2, "Bob", 3.5));
        studentList.add(new Student(3, "Charlie", 4.0));

        // Display all the Student details by iterating through the StudentList
        System.out.println("Student Details:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
