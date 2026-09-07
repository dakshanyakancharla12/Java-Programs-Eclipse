package CIET;

import java.util.*;

public class collection_Framework_Code {
	public static void main(String[] args) {
		Collection <String> names = new ArrayList<>();
		names.add("Sreemani");
		names.add("Lavanya");
		names.add("Susmitha");
		names.add("Dakshanya");
		names.add("Model");
		
		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.contains("Lavanya"));
		
		names.remove("Model");
		
		System.out.println(names);
		System.out.println(names.isEmpty());
		
		names.clear();
		
		System.out.println(names);
	}
}
