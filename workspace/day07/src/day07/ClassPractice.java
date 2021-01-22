package day07;

class Practice{
	
	String a;
	int b;
	
	public Practice() {
		
		
	}
	
	public Practice(String a, int b) {
		
		this.a = a;
		this.b = b;
		
		
	}
	
	
	void show() {
		
		System.out.println(this.a+" "+this.b);
		
	}
	
	
	
	
	
	
}


public class ClassPractice {
public static void main(String[] args) {
	

	Practice m = new Practice("abc", 123);
	
	m.show();
	
	
}	
	
}
