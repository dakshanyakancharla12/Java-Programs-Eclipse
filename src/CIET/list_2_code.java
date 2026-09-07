package CIET;

import java.util.*;

public class list_2_code {
	public static void main(String[] args) {
		List<String> user = new ArrayList<>();
		for(int i = 1; i <= 100; i++) {
			user.add("Users" + i);
		}
		
		int page = 3;
		int pageSize = 10;
		int start = (page - 1) * pageSize;
		int end = Math.min(start + pageSize, user.size());
		List<String> result = user.subList(start,  end);
		System.out.println(result);
	}
}
