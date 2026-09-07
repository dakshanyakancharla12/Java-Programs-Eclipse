package CIET;

import java.util.*;

public class linkedHashSet_Code {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("69");
		set.add("19");
		set.add("49");
		set.add("62");
		
		System.out.println(set);
		ArrayList<String> a = new ArrayList<>(set);
		System.out.println(a.get(0));
		System.out.println(a.indexOf("19"));
	}
}