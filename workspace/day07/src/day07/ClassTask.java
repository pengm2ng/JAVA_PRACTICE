package day07;

class Car{
	String brand;
	String color;
	int price;
	
 //art + shift + s -> o
	
	public Car() {
		//기본 생성자도 만들어 놓아라!
		
		
	}
	
	public Car(String color, int price) {
		
		this.color = color;
		this.price = price;
	}

	public Car(String brand, String color, int price) {

	this.brand = brand;
	this.color = color;
	this.price = price;
}

	void engineStart() {
		System.out.println("시동 킴");
		
	}
	
	void engineStop() {
		System.out.println("시동 끔");
		
		
	}
	
	void show() {
		System.out.println(this.brand + " "+ this.color + " " + this.price);
		
	}
	
}


public class ClassTask {
	public static void main(String[] args) {
		
		Car momCar = new Car("Benz", "Black",8000);
		Car dadCar = new Car("BMW", "Blue",7000);
		Car myCar = new Car("White", 45000);
		
		momCar.show();
		myCar.show();
		//new Car() == 값
		
//		
//		momCar.brand = "Benz";
//		momCar.color = "Black";
//		momCar.price = 8000;
//		
//		dadCar.brand = "BMW";
//		dadCar.color = "Blue";
//		dadCar.price = 7000;
//		
//		myCar.brand = "Bentley";
//		myCar.color = "White";
//		myCar.price = 45000;
//		
//		momCar.show();
//		dadCar.show();
//		myCar.show();

		
		
		
		
}
	
	
	
}
