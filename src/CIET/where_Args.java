package CIET;
//import java.util.Arrays;

public class where_Args {
	static int sum(int... numbers) {
		int total = 0;
		for(int number : numbers) {
			total += number;
		}
		return total;
	}
	public static void main(String[] args) {
		int [] numbers = {10, 20, 30, 40};
		int a = sum(numbers);
		System.out.println(a);
	}
}
