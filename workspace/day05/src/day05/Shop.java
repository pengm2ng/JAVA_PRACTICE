package day05;

import java.util.Scanner;

public class Shop {
public static void main(String[] args) {
	int [] Income= new int[3];
	String[] shop = {"������", "������", "ȫ����"};
	
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
		System.out.println(shop[i]+" ����� �Է�: ");
		Income[i]= sc.nextInt();
		sum = sum + Income[i];
		
	}
	
	avg= Float.parseFloat(String.format("%.2f", sum/Income.length));
			
	
		
	System.out.println("�� ����� : "+ sum+"��(����: ����)");
	System.out.println("��� �����: " + avg + "��(����: ����)");
	
	
	
	for(int i=0; i<Income.length; i++)
	{
		
		
		if(Income[i]>avg) {
			System.out.print("�μ�Ƽ�� ���� : ");
			System.out.println(shop[i]+"\n");
			count ++;
			
		}
		
	}
			
	//equals�� ���ڿ� ���� �� ���
	
//	if(result.equals("")) {
//		result = "���� ����";
//		
//	}
//	
			if(count==0) {
				
				System.out.println("�μ�Ƽ�� ������ �����ϴ�");
			}
			
			
			
			
			
			
			
			
}
}
