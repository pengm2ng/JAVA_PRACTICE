package day06;

import java.util.Scanner;
public class MethodTask {

	private static Scanner sc;


	//¦���� Ȧ����, Ȧ���� ¦���� �ٲ��ִ� �޼���
	//1���� ���� �Է��� �������� �������� �����ִ� �޼���
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
	

	// ������ �޼���
	//������ �ѱ۷� �ٲ��ִ� �޼���
	 void trans(String x) {
		String number = "0123456789";
		String [] korea = {"��","��","��","��","��","��","��","ĥ","��","��"};
		String [] result = new String[100];
		int count=0;
		
		for (int i = 0; i <x.length(); i++) {
			for (int j = 0; j < number.length(); j++) {
				if(x.charAt(i)==number.charAt(j)) {
			//result += korea[j];		 for �� ���� �ʿ䰡 ������.
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
