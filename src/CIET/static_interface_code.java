package CIET;

interface Calculator {
	static int square(int n) {
		return n * n;
	}
}

public class static_interface_code {
	public static void main(String[] args) {
		int d = Calculator.square(9);
		System.out.println(d);
	}
}
