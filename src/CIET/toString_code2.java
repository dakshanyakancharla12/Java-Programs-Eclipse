package CIET;
import java.util.Arrays;

public class toString_code2 {
	public static void main(String[] args) {
		int numbers[] = {40, 100, 89, 90, 19, 20};
		
		Arrays.sort(numbers, 1, 4);
		System.out.println(Arrays.toString(numbers));
	}
}
