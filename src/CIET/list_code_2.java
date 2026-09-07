package CIET;

import java.util.List;
import java.util.ArrayList;

public class list_code_2 {
	public static void main(String[] args) {
		List<Object> mixedList = new ArrayList<>();
		mixedList.add("Dakshanya");
		mixedList.add(599753);
		mixedList.add(3369);
		
		for(Object item:mixedList) {
			if(item instanceof String) {
				String str = (String)item;
				System.out.println(str);
			}
			else if(item instanceof Integer) {
				int n = (Integer)item;
				System.out.println(n);
			}
		}
	}
}
