package day11;

public class StringTest {
	public static void main(String[] args) {
		String data1 = "�۹α�";
		String data2 = "�۹α�";
		String data3 = new String("�۹α�");
				
		System.out.println(data1==data3);
		System.out.println(data1.equals(data3));
	}
	
	
}
