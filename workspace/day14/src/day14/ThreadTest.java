package day14;

public class ThreadTest extends Thread{
	
	private String data;
	
	public	ThreadTest(String data){			
			this.data =data;
	}
	
	//Start�ȿ� run�� �־ start�� ������ ��� run �� ������ ������μ� ���� ��.
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(data);
			try {
				sleep(400);
				
			}catch (InterruptedException e) {}
		}
	}
	
}
