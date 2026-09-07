package CIET;

import java.util.*;
//import java.io.*;

public class hashMap_code {
	public static void main(String[] args) {
		HashMap <Integer, String> scanner = new HashMap<>();
		scanner.put(101, "John");
		scanner.put(null, "David");
		scanner.put(102, "Smith");
		scanner.put(103, null);
		
		System.out.println(scanner);
		System.out.println(scanner.get(101));
		System.out.println(scanner.containsKey(101));
		System.out.println(scanner.containsValue("John"));
	}
}
