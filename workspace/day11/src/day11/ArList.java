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
		// �� �߰� : add()
		System.out.println(list.size());
	//ũ�� Ȯ�� : size()
		System.out.println(list);
		
		//����
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		//����
		Collections.shuffle(list);
		System.out.println(list);
		
		
		
		
	}
}
