package CIET;

public class string_Code {
	public static void main(String[] main) {
		//Using string literal
		String s1 = "hello";
		
		String s2 = new String("Welcome");
		
		char[] letter = {'j', 'a', 'v', 'a'};
		String s3 = new String(letter);
		
		byte[] data = {65, 66, 67};
		String s4 = new String(data);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
