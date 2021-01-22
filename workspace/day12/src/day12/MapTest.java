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
		
		fruitMap.put("���", 1000);
		fruitMap.put("��", 2000);
		fruitMap.put("�ڵ�", 3000);
		fruitMap.put("����", 4000);
		
		System.out.println(fruitMap.get("���"));
		
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
			System.out.println("���� �̸� : " + e.getKey()+ ", ���� : " + e.getValue());
		}
	}
}
