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
		System.out.println("�θ� Ŭ����");
		
	}
	
	
	void show() {
	System.out.println(data);	
		
	}
	
}

class B extends A{
	
	public B(int data) {
		super(data);//2. private �� A �����ڿ� data �� ����
		System.out.println("�ڽ� Ŭ����");
		
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
