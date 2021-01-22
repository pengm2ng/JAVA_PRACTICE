package day06;

import java.util.Scanner;

public class MethodTest {
	
	//static 은 실행할 때 가장 먼저 검사하기 때문에 메서드를 선언할 때 앞에 static을 붙여준다.
	
	 int f(int x){
			
		System.out.println("f 메서드 입니다.");
			
			return 2*x+1;
			
		
		}
		
		
		
	  public static void main(String[] args) {
		
		  MethodTest m = new MethodTest();
		  
		int result =  m.f(1);
		  System.out.println(result);
	}
	  
	  
	 
}
