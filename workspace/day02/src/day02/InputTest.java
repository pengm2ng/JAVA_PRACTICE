package day02;

import java.util.Scanner;//�ڹ� ��ƿ�� �ִ� ��ĳ��

public class InputTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//�Է� Ŭ����
	String name = null;
	int age=0;
	/*	String name2= null;
		String name3= null;
		System.out.println("�̸��� ������?");
		name = sc.next();//��°�� �Է��� ���� ���⿡ �����. next�� ������ ������ �ν�
		
		System.out.println("�̸� : "+name); //������ �ƴ϶� ����
		System.out.println("�̸� : "+name2); 
		System.out.println("�̸� : "+name3); 
*/
		System.out.println("�̸��� ������?");
		name =sc.nextLine();

		System.out.println("���̸� �Է��ϼ���");
		age=sc.nextInt();
	
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
	 
	}

}
