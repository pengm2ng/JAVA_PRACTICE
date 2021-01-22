package day02;

import java.util.Scanner;

public class InputTask {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String data1="첫번째 정수 : ";
		String data2="두번째 정수 : ";
		int num1=0;
		int num2=0;
		int result =0; 
		
		System.out.println(data1);
		num1=Integer.parseInt(sc.next());
		System.out.println(data2);
		num2=Integer.parseInt(sc.next());
		result = num1+num2;
		System.out.println(result);
		
		

	}

}
