package day11;

public class WrappingTest {
	public static void main(String[] args) {
	
		
		Integer data1 = new Integer(10);
		double num = 10.4;
		String data = "10";
		Integer num2 = new Integer(data);
		
		
		int data2 = data1; //언박싱
		data1 = data2; //박싱

		//jdk 1.5버전 이후 오토박싱과 오토언박싱이 가능하다.
		
		Integer data3 = 20;//오토박싱
		int data4 = data3;// 오토 언박싱
		
	}
}
