package day14;

public class Animals2 implements Runnable{

	private String noise;

	
	public Animals2(String noise) {
		this.noise = noise;
	}

	@Override
	public void run() {
		for(int i =0; i<10; i++) {
			
			System.out.println(noise);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
			
		}
	}
	
	
}
