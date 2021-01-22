package day11;

public class StringTest {
	public static void main(String[] args) {
		String data1 = "¼Û¹Î±â";
		String data2 = "¼Û¹Î±â";
		String data3 = new String("¼Û¹Î±â");
				
		System.out.println(data1==data3);
		System.out.println(data1.equals(data3));
	}
	
	
}
