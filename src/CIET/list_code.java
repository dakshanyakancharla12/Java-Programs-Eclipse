package CIET;
import java.util.*;

public class list_code {
	public static void main(String[] args) {
		List<Integer> names = new ArrayList<>();
		names.add(10);
		names.add(20);
		names.add(20);
		System.out.println(names);
		System.out.println(names.get(0));
		names.set(1, 90);
		System.out.println(names);
		names.remove(2);
		System.out.println(names);
	}
}