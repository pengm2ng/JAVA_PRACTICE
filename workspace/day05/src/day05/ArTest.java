package day05;

public class ArTest {

		public static void main(String[] args) {
			int [] arData = new int[10];
			//new ����� heap������ �ּҸ� ��Ÿ���� ĭ�� ����.
		   //arData[0]=7;
		   //	System.out.println(arData[0]);
			
			for (int i = 0; i < arData.length; i++) {
				arData[i] = 10-i;
				
			}
			
			for (int i = 0; i < arData.length; i++) {
			
				System.out.println(arData[i]);
				
			}
			
			
			
		}
}
