package day07;

public class Overloading {
	//메서드의 이름은 같으나 매개변수의 개수나 타입으로 구분한다.
	
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
