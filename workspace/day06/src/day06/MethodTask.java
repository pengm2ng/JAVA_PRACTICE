package day06;

import java.util.Scanner;
public class MethodTask {

	private static Scanner sc;


	//짝수를 홀수로, 홀수를 짝수로 바꿔주는 메서드
	//1부터 내가 입력한 값까지의 누적합을 구해주는 메서드
	/*int add(int x) {
		
		int sum=0;
		
		for (int i = 0; i < x; i++) {
			
			sum= sum+(i+1);
		}
		
		return sum;
	
		
		
	}
	

	
	
	public static void main(String[] args) {
		int num=0;
		
		Scanner sc = new Scanner(System.in);
		MethodTask m =  new MethodTask();
		num=sc.nextInt();
		int result = m.add(num);
		System.out.println(result);
	}
	
	*/
	

	// 나눗셈 메서드
	//정수를 한글로 바꿔주는 메서드
	 void trans(String x) {
		String number = "0123456789";
		String [] korea = {"공","일","이","삼","사","오","육","칠","팔","구"};
		String [] result = new String[100];
		int count=0;
		
		for (int i = 0; i <x.length(); i++) {
			for (int j = 0; j < number.length(); j++) {
				if(x.charAt(i)==number.charAt(j)) {
			//result += korea[j];		 for 문 돌릴 필요가 없어짐.
			// korea.charAt((int)(data.charAt(i));		
					result[i]=korea[j];
					count ++;
			   }
				
			}			
		}
		
		
		for (int i = 0; i < count; i++) {
			System.out.print(result[i]);
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String num = "";
	
		MethodTask m =  new MethodTask();
		
			num=sc.next();
	
		m.trans(num);
		
	}
	
	
	
	
}
