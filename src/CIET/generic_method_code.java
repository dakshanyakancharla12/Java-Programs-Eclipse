package CIET;

//import java.util.concurrent.ConcurrentHashMap;

class Demo {
	public static <T> void printArray(T[] arr) {
		for(T value : arr) {
			System.out.println(value);
		}
	}
}

public class generic_method_code {
	public static void main(String[] args) {
		String[] names = {"Dakshany" , "Lavanya", "Sreemani"};
		Demo.printArray(names);
	}
}