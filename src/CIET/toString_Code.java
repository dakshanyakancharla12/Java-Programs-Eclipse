package CIET;
import java.util.Arrays;

public class toString_Code {
	public static void main(String[] args) {
		int numbers[] = {10, 20, 30, 40};
		System.out.println(Arrays.toString(numbers));
		for(int i : numbers) {
			System.out.println(i);
		}
	}
}
