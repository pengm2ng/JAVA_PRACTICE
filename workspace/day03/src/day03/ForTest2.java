package day03;

public class ForTest2 {
	public static void main(String[] args) {
		//1~100���� �� 4������
			
		for(int i =1; i<101; i++)
		{
			System.out.println(i);
			if(i==4) break;
		}
		
		//1~100���� �� 70����(�ʱⰪ�� 0���� ����)
		for(int i =0; i<100; i++)
		{
			System.out.println(100-i);
			if(i==30) break;
		}

		//1~100���� �� ¦���� ���(continue)
		for(int i=0; i<100;i++) {
			if(i%2==1)continue;
			System.out.println(i);
		}
		
		//1~100���� �� 3�� 5�� ����� ���
		for(int i=1; i<=100;i++) {
			if(i%3!=0||i%5!=0)continue;
			System.out.println(i);
		}
	}
}
