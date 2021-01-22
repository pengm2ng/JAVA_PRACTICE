package day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class MapTest {
	
	public static void main(String[] args) {
		HashMap<String, Integer> fruitMap = new HashMap<>();
		Collection<Integer> price = null;
		ArrayList<Integer> arPrice = new ArrayList<>();
		
		fruitMap.put("사과", 1000);
		fruitMap.put("배", 2000);
		fruitMap.put("자두", 3000);
		fruitMap.put("수박", 4000);
		
		System.out.println(fruitMap.get("사과"));
		
		System.out.println(fruitMap.values());
		System.out.println(fruitMap.keySet());
		
		price = fruitMap.values();
		for(int i : price)
		{
			System.out.println(i);
		}

		price.forEach(data -> arPrice.add(data));
		System.out.println(arPrice);
		
		Iterator<Entry<String, Integer>> iter = fruitMap.entrySet().iterator();
		
		while(iter.hasNext()) {
			Entry<String, Integer> e = iter.next();
			System.out.println("과일 이름 : " + e.getKey()+ ", 가격 : " + e.getValue());
		}
	}
}
