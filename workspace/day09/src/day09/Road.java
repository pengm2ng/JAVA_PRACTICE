package day09;

public class Road {
	public static void main(String[] args) {
	
		//up casting
		//supercar �� �ִ� �� �θ� car Ÿ������ ����� ��.

		Car noOptionFerrari = new SuperCar("Ferrari","Red", 45000, "Sport");
		Car car = new Car();
		SuperCar ferrari = new SuperCar("Ferrari","Red", 45000, "Sport");
		
		
		//down castring : ����
		//SuperCar car = (SuperCar)new Car();
		
		if(car instanceof Car) {
			System.out.println("Car Ÿ���Դϴ�.");
		}
		
		if(ferrari instanceof Car) {
			System.out.println("Car Ÿ���Դϴ�.");
			
		}
		if(noOptionFerrari instanceof Car) {
			System.out.println("Car Ÿ���Դϴ�.");
			
		}
		if(car instanceof SuperCar) {
			
			System.out.println("SuperCar Ÿ���Դϴ�.");
		}
		
		if(noOptionFerrari instanceof SuperCar) {
			System.out.println("SuperCar Ÿ���Դϴ�.");
		}
	}
	
}
