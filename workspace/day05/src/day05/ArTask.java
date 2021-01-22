package day05;

import  java.util.Scanner;

public class ArTask {

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	//int [] Arr= new int[100];
	
	String [] Arr = new String[5];
	
	/*for (int i = 0; i < Arr.length; i++) {
		
		Arr[i]=sc.nextInt();
		
	}
	for (int i = 0; i < Arr.length; i++) {
		
		System.out.println(Arr[i]);
		
	}
	
	*/
	
//		for (int i = 0; i < Arr.length ; i++) {
//			
//			Arr[i]=100-i;
//			
//			System.out.println(Arr[i]);
//			
//			
//		}
	
	
	for (int i = 0; i < Arr.length; i++) {
		
		
		Arr[i]= sc.next();		
		
	
		
	}
	
	for(int i =0; i<Arr.length; i++) {
		
		System.out.println(Arr[i]);
		
		
	}
	
}
	
	
}
