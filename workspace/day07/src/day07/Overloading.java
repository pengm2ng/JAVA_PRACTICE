package day07;

public class Overloading {
	//�޼����� �̸��� ������ �Ű������� ������ Ÿ������ �����Ѵ�.
	
	static void add(int x, int y) {
		System.out.println(x+y);
	}
	
	static void add2(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
	public static void main(String[] args) {
		add(1,3);
	}
}
