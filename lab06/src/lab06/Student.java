package lab06;

import java.util.ArrayList;
import java.util.List;

class Student {
	int studentID;
	String name;
	double GPA;
	
	public Student(int studentID, String name, double GPA) {
		this.studentID = studentID;
		this.name = name;
		this.GPA = GPA;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public String getName() {
		return name;
	}
	
	public double gatGPA() {
		return GPA;
	}
	
	//Override
	public String toString() {
        return "Student ID: " + studentID + ", Name: " + name + ", GPA: " + GPA;
    }
}
