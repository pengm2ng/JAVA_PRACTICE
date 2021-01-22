package day08;

class A{
	private int data = 10;
	
//1. 
	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}


	public A(int data) {
		this.data = data;
		System.out.println("부모 클래스");
		
	}
	
	
	void show() {
	System.out.println(data);	
		
	}
	
}

class B extends A{
	
	public B(int data) {
		super(data);//2. private 을 A 생성자에 data 값 전달
		System.out.println("자식 클래스");
		
	}
	
	
	void printData() {
		show();
	//	setData(100);
		System.out.println(getData());
	
	}
	
	
}



public class Inheritance {
	
	public static void main(String[] args) {
		
		
		B instance = new B(100);
		
		instance.printData();
		
		
		
		
		
		
		
	}

	
}
