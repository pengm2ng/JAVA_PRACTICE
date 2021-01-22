package day14;

public class ThreadTest extends Thread{
	
	private String data;
	
	public	ThreadTest(String data){			
			this.data =data;
	}
	
	//Start안에 run이 있어서 start를 실행할 경우 run 이 각각의 스레드로서 실행 됨.
	
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
