package day11;

import java.util.ArrayList;
import java.util.Collections;

public class ArList2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		
		for(int i = 1; i<=10; i++) {
			
			list.add(i*10);
		}

		//10 ������ 15 �ֱ�
		//�۾� ����
		//1. 10ã��
		//2. �ε�����15 �ֱ�
		list.add(list.indexOf(new Integer(10))+1,15);
		
		//60�� 600���� �ٲٱ�
		list.set(list.indexOf(new Integer(60)), 600);
		
		//15,20 ���ֱ�
		list.remove(new Integer(15));
		list.remove(list.indexOf(new Integer(20)));
		

			for(int i :list) {
				System.out.println(i);
			}
			
	}
}
