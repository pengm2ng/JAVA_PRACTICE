package day07;

class A{
	
	int data =10;

		void showData() {
			int data = 0;
			System.out.println(this);
				System.out.println(this.data);
				System.out.println(data);
				//���������� �������� ����, this�� ���� ������ ����Ŵ.
		}
	
		
	
}


public class ClassTest {
	public static void main(String[] args) {
		
		A a = new A();
		//��üȭ
		System.out.println(a);
		a.showData();
		//this�� a�� �ּҸ� ������ġ ����.
	}
}
