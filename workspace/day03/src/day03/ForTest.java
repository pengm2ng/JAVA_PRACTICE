package day03;

public class ForTest {

public static void main(String[] args) {
	int j=0;
	String data="A";
	//1부터 100까지

	for(int i=0; i<100; i++) {
		
		System.out.println((i+1));	
}

	//100부터 1까지
	
	for(int i=100; i>0; i--) {
		System.out.println(i);
	}
	
	//1부터 100까지 짝수만 출력하기(for문만 사용
	for(int i=1; i<=100; i+=2)
	{
		System.out.println(i);
	}
	
	
	//1부터 100까지 홀수만 출력하기
for(int i=1; i<=100; i++) {
		
		if(i%2==1)
		
		System.out.println(i);
		
	}
	
	
	
	//1부터 10까지의 합 구하기
	for(int i=1; i<=10; i++) {
		
		j=j+i;
		
		
	}
	System.out.println(j);
	
	//1부터 100까지의 합 구하기
	j=0;
	for(int i=1; i<=100; i++) {
		
		j=j+i;
		
		
	}
	System.out.println(j);
	
		//A까지 E 출력하기 (for)
	for(char i='A';i<'E'+1;i++) {
		
		System.out.println(i);
		
	}







}
}
