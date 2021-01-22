package day14;

public class Animals implements Runnable{

		private String noise;

		
		public Animals(String noise) {
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
