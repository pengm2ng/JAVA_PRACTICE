package day07;

class A{
	
	int data =10;

		void showData() {
			int data = 0;
			System.out.println(this);
				System.out.println(this.data);
				System.out.println(data);
				//지역변수와 전역변수 차이, this는 전역 변수를 가리킴.
		}
	
		
	
}


public class ClassTest {
	public static void main(String[] args) {
		
		A a = new A();
		//객체화
		System.out.println(a);
		a.showData();
		//this가 a의 주소를 바통터치 받음.
	}
}
