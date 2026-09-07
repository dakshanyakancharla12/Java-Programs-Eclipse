package CIET;

//import java.util.concurrent.ConcurrentHashMap;

class Demo1 <T, V> {
	private T key;
	private V value;
	Demo1(T key, V value) {
		this.key = key;
		this.value = value;
	}
	public T getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}

public class generic_method_2 {
	public static void main(String[] args) {
		Demo1 <Integer, String> student = new Demo1<> (100, "Dakshanya");
		Demo1 <Integer, String> student1 = new Demo1<> (102, "Meghana");
		Demo1 <Integer, String> student2 = new Demo1<> (101, "Daniya");
		
		System.out.println(student.getKey());
		System.out.println(student.getValue());
		System.out.println(student1.getValue());
		System.out.println(student2.getKey());
	}
}
