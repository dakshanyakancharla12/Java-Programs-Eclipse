package CIET;
import java.util.*;
//import java.util.ArrayList;

public class linkedList_Code {
	public static void main(String[] args) {
		LinkedList<String> lt = new LinkedList<>();
		lt.add("Dakshanya");
		lt.add("Sreemani");
		lt.add("Lavanya");
		lt.add("Susmitha");
		lt.add("Sweety");
		
		System.out.println(lt);
		lt.addFirst("Sreemani");
		lt.addLast("Model Sri");
		
		System.out.println(lt);
		lt.removeFirst();
		lt.removeLast();
		
		System.out.println(lt);
	}
}