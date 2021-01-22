package day08;


public class Car {
	int wheel =4;
	public String brand;
	protected String color;
	private int price;

	public Car() {
		
		
	}

	public Car(int wheel, String brand, String color, int price) {
		
		this.wheel = wheel;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	void engineStart() {
		System.out.println("¿­¼è·Î ½Ãµ¿ Å´");
	}
	
	void engineStop() {
		System.out.println("¿­¼è·Î ½Ãµ¿ ²û");
	}
	
}
