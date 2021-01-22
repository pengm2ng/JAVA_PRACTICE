package bakery;

public class BreadMaker implements Runnable{

		BreadPlate bread;
		
		public BreadMaker(BreadPlate bread) {
			this.bread = bread;
		}
	
		
		
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			bread.makeBread();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		System.out.println("»§ÀÌ ´Ù ¶³¾îÁ³½À´Ï´Ù.");
	}
	
	
}
