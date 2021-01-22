package day05;

import java.util.Scanner;

public class Building {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int [] arIncome = new int[3];
			double sum=0;
			double average =0;
		
			//int [] a	= {0,};
			//전부 0으로 초기화
		
		
			for (int i = 0; i < arIncome.length; i++) {
				System.out.println((i+1)+"호 월세를 입력하세요(단원 : 만원)");
				arIncome[i] = sc.nextInt();
				sum=sum+arIncome[i];
			}
				
			average = Double.parseDouble(String.format("%.2f", sum/arIncome.length));
			//형변환
			System.out.println("총 월세(단위 : 만원) :"+ sum);
			System.out.println("평균 월세(단위 : 백원)"+ average);
			
			
			//System.out.printf("평균 월세(단위 : 백원) : %.2f", average);
			
			
			
			
		}
}
