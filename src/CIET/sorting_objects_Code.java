package CIET;

import java.util.*;

class Student1 implements Comparable<Student1> {
	String name;
	int marks;
	Student1(int marks, String name) {
		this.marks = marks;
		this.name = name;
	}
	@Override
	public int compareTo(Student1 other) {
		return this.marks - other.marks;
	}
	public String toString() {
		return name + " " + marks;
	}
}

public class sorting_objects_Code {
	public static void main(String[] args) {
		List<Student1> students = new ArrayList<>();
		students.add(new Student1(99, "Lavanya"));
		students.add(new Student1(20, "Abhiram"));
		students.add(new Student1(33, "Bhavani"));
		students.add(new Student1(69, "Dakshanya"));
		
		Collections.sort(students);
		System.out.println(students);
	}
}
