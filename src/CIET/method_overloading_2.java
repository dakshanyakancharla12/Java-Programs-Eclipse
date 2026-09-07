package CIET;
//import java.util.Scanner;

public class method_overloading_2 {
	static double calculateArea(double side) {
		return side * side;
	}
	static double calculateArea(double length, double width) {
		return length * width;
	}
	static double calculateArea(double radius, boolean isCircle) {
		return Math.PI * radius * radius;
	}
	public static void main(String[] args) {
		System.out.println(calculateArea(12));
		System.out.println(calculateArea(12, 34));
		System.out.println(calculateArea(3));
	}
}
