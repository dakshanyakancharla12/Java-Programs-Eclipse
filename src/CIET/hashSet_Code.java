package CIET;

import java.util.*;

public class hashSet_Code {
	public static void main(String[] args) {
		HashSet<String> lg = new HashSet<>();
		lg.add("Cat");
		lg.add("Dog");
		lg.add("Rat");
		
		System.out.println(lg);
		System.out.println(lg.contains("Dog"));
		lg.remove("Cat");
		System.out.println(lg);
	}
} 