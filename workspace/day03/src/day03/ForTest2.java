package day03;

public class ForTest2 {
	public static void main(String[] args) {
		//1~100까지 중 4까지만
			
		for(int i =1; i<101; i++)
		{
			System.out.println(i);
			if(i==4) break;
		}
		
		//1~100까지 중 70가지(초기값은 0으로 고정)
		for(int i =0; i<100; i++)
		{
			System.out.println(100-i);
			if(i==30) break;
		}

		//1~100까지 중 짝수를 출력(continue)
		for(int i=0; i<100;i++) {
			if(i%2==1)continue;
			System.out.println(i);
		}
		
		//1~100까지 중 3과 5의 공배수 출력
		for(int i=1; i<=100;i++) {
			if(i%3!=0||i%5!=0)continue;
			System.out.println(i);
		}
	}
}
