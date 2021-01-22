package day09;

public abstract class Shape {

	double area;
	
	abstract void draw(double w, double h);
	
	final void finalFunction() {	
		System.out.println("�߻� Ŭ������ �Ϲ� �޼���. ������ �Ұ���");
	}

}


class Rectangle extends Shape{

	@Override
	void draw(double w, double h) {
		area = w*h;
		System.out.println("���� : " + area + "cm��" );
	}
	
	
}

class Triangle extends Shape{

	@Override
	void draw(double w, double h) {
		area = (w*h)/2;
		System.out.println("���� : " + area+ "cm��");
		
	}
	
	
	
}