package CIET;

//import java.util.concurrent.ConcurrentHashMap;

class Student implements Comparable<Student> {
	int marks;
	Student(int marks) {
		this.marks = marks;
	}
	@Override
	public int compareTo(Student other) {
		return this.marks - other.marks;
	}
}

public class generic_method_3 {
	public static void main(String[] args) {
		Student s1 = new Student(80);
		Student s2 = new Student(99);
		
		int s = s1.compareTo(s2);
		System.out.println(Math.abs(s));
	}
}
