package day08;

public class SuperCar extends Car {

	String mode;
	
	public SuperCar() {
		
		System.out.println("�ڽ� Ŭ������ �⺻ ������");
		
	}

	public SuperCar(int wheel, String brand, String color, int price, String mode) {
		super(wheel, brand, color, price);		
		//this.color="", protected�� ���� ����
		this.mode = mode;
	
	}
	
	@Override
	void engineStart() {
		System.out.println("�������� �õ� Ŵ");
		
	}
	
	@Override
	void engineStop() {
		System.out.println("�������� �õ� ��");
	
	}
	
	@Override
	public String toString() {
	
		return brand + " " + color + " "+ getPrice()+ " "+ mode;
	}
	
}
