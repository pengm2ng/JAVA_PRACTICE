package day09;

public class SuperCar extends Car {

	String mode;
		
	public SuperCar() {
		
		
	}
	
	public SuperCar(String brand,String color, int price, String mode){
		super(brand, color, price);
		this.mode=mode;
	}
	
	@Override
	void engineStart() {

		System.out.println("�������� �õ��� �������ϴ�.");
		
	}
	
	@Override
	void engineStop() {
	System.out.println("�������� �õ��� �������ϴ�.");
	}
	
	
}
