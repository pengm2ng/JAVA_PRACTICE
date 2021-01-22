package day07;

public class variable2 {
	public static void main(String[] args) {
		
		variable v= new variable();
		
		v.function();
		v.function();
		v.function();
		v.function();
		
		
		v=new variable();
		//전역변수는 new를 만나면 초기화가 되지만 static을 붙여주면 new를 붙여도 초기화가 되지 않는다.
		
		v.function();
		
	}
	
	
	
	
}
