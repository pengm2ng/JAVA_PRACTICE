package day11;

import java.util.ArrayList;
import java.util.Collections;

public class ArList2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		
		for(int i = 1; i<=10; i++) {
			
			list.add(i*10);
		}

		//10 다음에 15 넣기
		//작업 순서
		//1. 10찾기
		//2. 인덱스에15 넣기
		list.add(list.indexOf(new Integer(10))+1,15);
		
		//60을 600으로 바꾸기
		list.set(list.indexOf(new Integer(60)), 600);
		
		//15,20 없애기
		list.remove(new Integer(15));
		list.remove(list.indexOf(new Integer(20)));
		

			for(int i :list) {
				System.out.println(i);
			}
			
	}
}
