package day03;

public class ForTest {

public static void main(String[] args) {
	int j=0;
	String data="A";
	//1���� 100����

	for(int i=0; i<100; i++) {
		
		System.out.println((i+1));	
}

	//100���� 1����
	
	for(int i=100; i>0; i--) {
		System.out.println(i);
	}
	
	//1���� 100���� ¦���� ����ϱ�(for���� ���
	for(int i=1; i<=100; i+=2)
	{
		System.out.println(i);
	}
	
	
	//1���� 100���� Ȧ���� ����ϱ�
for(int i=1; i<=100; i++) {
		
		if(i%2==1)
		
		System.out.println(i);
		
	}
	
	
	
	//1���� 10������ �� ���ϱ�
	for(int i=1; i<=10; i++) {
		
		j=j+i;
		
		
	}
	System.out.println(j);
	
	//1���� 100������ �� ���ϱ�
	j=0;
	for(int i=1; i<=100; i++) {
		
		j=j+i;
		
		
	}
	System.out.println(j);
	
		//A���� E ����ϱ� (for)
	for(char i='A';i<'E'+1;i++) {
		
		System.out.println(i);
		
	}







}
}
