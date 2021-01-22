package day09;

public abstract class Shape {

	double area;
	
	abstract void draw(double w, double h);
	
	final void finalFunction() {	
		System.out.println("추상 클래스의 일반 메서드. 재정의 불가능");
	}

}


class Rectangle extends Shape{

	@Override
	void draw(double w, double h) {
		area = w*h;
		System.out.println("넓이 : " + area + "cm²" );
	}
	
	
}

class Triangle extends Shape{

	@Override
	void draw(double w, double h) {
		area = (w*h)/2;
		System.out.println("넓이 : " + area+ "cm²");
		
	}
	
	
	
}