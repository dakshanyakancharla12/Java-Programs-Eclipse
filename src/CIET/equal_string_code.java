package CIET;

public class equal_string_code {
	public static void main(String[] args) {
		String s1 = "Hello";
		
		String s2 = new String("Hello");
		if (s1 == s2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}
}
