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

		System.out.println("음성으로 시동이 켜졌습니다.");
		
	}
	
	@Override
	void engineStop() {
	System.out.println("음성으로 시동이 꺼졌습니다.");
	}
	
	
}
