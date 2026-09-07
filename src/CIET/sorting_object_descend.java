package CIET;

import java.util.*;

class Student2 implements Comparable<Student2> {
	String name;
	int marks;
	Student2(int marks, String name) {
		this.marks = marks;
		this.name = name;
	}
	@Override
	public int compareTo(Student2 other) {
		return other.marks - this.marks;
	}
	public String toString() {
		return name + " " + marks;
	}
}

public class sorting_object_descend {
	public static void main(String[] args) {
		List<Student2> students = new ArrayList<>();
		students.add(new Student2(99, "Lavanya"));
		students.add(new Student2(20, "Abhiram"));
		students.add(new Student2(33, "Bhavani"));
		students.add(new Student2(69, "Dakshanya"));
		
		Collections.sort(students);
		System.out.println(students);
	}
}
