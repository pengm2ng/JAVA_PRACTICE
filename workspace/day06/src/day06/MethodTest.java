package day06;

import java.util.Scanner;

public class MethodTest {
	
	//static �� ������ �� ���� ���� �˻��ϱ� ������ �޼��带 ������ �� �տ� static�� �ٿ��ش�.
	
	 int f(int x){
			
		System.out.println("f �޼��� �Դϴ�.");
			
			return 2*x+1;
			
		
		}
		
		
		
	  public static void main(String[] args) {
		
		  MethodTest m = new MethodTest();
		  
		int result =  m.f(1);
		  System.out.println(result);
	}
	  
	  
	 
}
