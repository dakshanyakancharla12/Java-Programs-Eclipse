package CIET;
//import java.util.Scanner;

public class create_method_Code {
	int dog(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		create_method_Code l = new create_method_Code();
		int a = l.dog(10, 20);
		System.out.println(a);
	}
}
