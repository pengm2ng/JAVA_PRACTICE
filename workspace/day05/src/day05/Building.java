package day05;

import java.util.Scanner;

public class Building {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int [] arIncome = new int[3];
			double sum=0;
			double average =0;
		
			//int [] a	= {0,};
			//���� 0���� �ʱ�ȭ
		
		
			for (int i = 0; i < arIncome.length; i++) {
				System.out.println((i+1)+"ȣ ������ �Է��ϼ���(�ܿ� : ����)");
				arIncome[i] = sc.nextInt();
				sum=sum+arIncome[i];
			}
				
			average = Double.parseDouble(String.format("%.2f", sum/arIncome.length));
			//����ȯ
			System.out.println("�� ����(���� : ����) :"+ sum);
			System.out.println("��� ����(���� : ���)"+ average);
			
			
			//System.out.printf("��� ����(���� : ���) : %.2f", average);
			
			
			
			
		}
}
