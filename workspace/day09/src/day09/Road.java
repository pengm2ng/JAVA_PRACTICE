package day09;

public class Road {
	public static void main(String[] args) {
	
		//up casting
		//supercar 에 있는 게 부모 car 타입으로 덮어쓰기 됨.

		Car noOptionFerrari = new SuperCar("Ferrari","Red", 45000, "Sport");
		Car car = new Car();
		SuperCar ferrari = new SuperCar("Ferrari","Red", 45000, "Sport");
		
		
		//down castring : 오류
		//SuperCar car = (SuperCar)new Car();
		
		if(car instanceof Car) {
			System.out.println("Car 타입입니다.");
		}
		
		if(ferrari instanceof Car) {
			System.out.println("Car 타입입니다.");
			
		}
		if(noOptionFerrari instanceof Car) {
			System.out.println("Car 타입입니다.");
			
		}
		if(car instanceof SuperCar) {
			
			System.out.println("SuperCar 타입입니다.");
		}
		
		if(noOptionFerrari instanceof SuperCar) {
			System.out.println("SuperCar 타입입니다.");
		}
	}
	
}
