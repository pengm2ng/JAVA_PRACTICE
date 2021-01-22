package day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTEST {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("A");
		set.add("AB");
		set.add("B");
		set.add("O");
		set.add("O");
		set.add("O");
		set.add("O");
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
		System.out.println(iter.next());
	}
}
}
