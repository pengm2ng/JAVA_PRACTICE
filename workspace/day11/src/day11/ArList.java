package day11;

import java.util.ArrayList;
import java.util.Collections;

public class ArList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(40);
		list.add(20);
		list.add(60);
		list.add(50);
		list.add(100);
		// 값 추가 : add()
		System.out.println(list.size());
	//크기 확인 : size()
		System.out.println(list);
		
		//정렬
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		//셔플
		Collections.shuffle(list);
		System.out.println(list);
		
		
		
		
	}
}
