package day11;

public class WrappingTest {
	public static void main(String[] args) {
	
		
		Integer data1 = new Integer(10);
		double num = 10.4;
		String data = "10";
		Integer num2 = new Integer(data);
		
		
		int data2 = data1; //��ڽ�
		data1 = data2; //�ڽ�

		//jdk 1.5���� ���� ����ڽ̰� �����ڽ��� �����ϴ�.
		
		Integer data3 = 20;//����ڽ�
		int data4 = data3;// ���� ��ڽ�
		
	}
}
