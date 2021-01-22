package access;

import java.util.Scanner;

import day07.AccessTest;


public class AccessTest3 {
	public static void main(String[] args) {
		AccessTest at = new AccessTest();
		Scanner sc = new Scanner(System.in);
		
		
		at.setData4(sc.nextInt());
		System.out.println(at.getData4());
		
		
		
	}
}
