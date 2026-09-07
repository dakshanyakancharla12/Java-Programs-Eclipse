package CIET;

//import java.util.List;
import java.util.ArrayList;

public class arrayList_code {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(null);
		System.out.println(numbers);
		System.out.println(numbers.get(0));
		numbers.remove(Integer.valueOf(10));
		System.out.println(numbers);
	}
}