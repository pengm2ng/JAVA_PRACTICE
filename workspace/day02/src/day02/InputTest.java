package day02;

import java.util.Scanner;//자바 유틸에 있는 스캐너

public class InputTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//입력 클래스
	String name = null;
	int age=0;
	/*	String name2= null;
		String name3= null;
		System.out.println("이름이 뭐에요?");
		name = sc.next();//통째로 입력한 값이 여기에 저장됨. next는 공백을 끝으로 인식
		
		System.out.println("이름 : "+name); //연산이 아니라 연결
		System.out.println("이름 : "+name2); 
		System.out.println("이름 : "+name3); 
*/
		System.out.println("이름이 뭐에요?");
		name =sc.nextLine();

		System.out.println("나이를 입력하세요");
		age=sc.nextInt();
	
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	 
	}

}
