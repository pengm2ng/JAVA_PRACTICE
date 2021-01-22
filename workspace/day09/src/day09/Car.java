package day09;

public class Car {
		String brand;
		String color;
		int price;
		
		public Car() {
			
			
			
		}
		
		public Car(String brand, String color, int price) {
		
			this.brand = brand;
			this.color = color;
			this.price = price;
		}
		
		
		void engineStart() {
			System.out.println("시동이 켜졌습니다.");
			
		}
		
		void engineStop() {
			
			System.out.println("시동이 꺼졌습니다.");
			
			
		}
		
	
	
}
