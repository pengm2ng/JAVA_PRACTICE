package day05;

import java.util.Scanner;

public class Shop {
public static void main(String[] args) {
	int [] Income= new int[3];
	String[] shop = {"강남점", "신촌점", "홍대점"};
	
	float sum=0;
	float avg=0;
	
	int num=0;
	int count =0;
	Scanner sc = new Scanner(System.in);
	
	//num =sc.nextInt();
//	for(int i=0; i<num; i++) {
//		
//	shop[i]=sc.next();	
//		
//		
//	}
	
	
	for(int i=0; i<Income.length; i++)
	{
		System.out.println(shop[i]+" 매출액 입력: ");
		Income[i]= sc.nextInt();
		sum = sum + Income[i];
		
	}
	
	avg= Float.parseFloat(String.format("%.2f", sum/Income.length));
			
	
		
	System.out.println("총 매출액 : "+ sum+"원(단위: 만원)");
	System.out.println("평균 매출액: " + avg + "원(단위: 만원)");
	
	
	
	for(int i=0; i<Income.length; i++)
	{
		
		
		if(Income[i]>avg) {
			System.out.print("인센티브 매장 : ");
			System.out.println(shop[i]+"\n");
			count ++;
			
		}
		
	}
			
	//equals는 문자열 비교할 때 사용
	
//	if(result.equals("")) {
//		result = "매점 없음";
//		
//	}
//	
			if(count==0) {
				
				System.out.println("인센티브 지점이 없습니다");
			}
			
			
			
			
			
			
			
			
}
}
