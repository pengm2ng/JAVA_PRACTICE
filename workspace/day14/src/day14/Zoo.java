package day14;


public class Zoo {

	public static void main(String[] args) {
		
	
	Trainer p1 = new Trainer();
	Thread Mingi = new Thread(p1);
	Mingi.start();
	
	Animals animal1 = new Animals("À¸¸£··");
	Animals animal2 = new Animals("¾îÈï");
	Animals animal3 = new Animals("¿ì³¢³¢");
	Animals animal4 = new Animals("¿ÀÀ× ¿ÀÀ×");
	
	Thread Lion = new Thread(animal1);
	Thread Tiger = new Thread(animal2);
	Thread Monkey = new Thread(animal3);
	Thread Pig = new Thread(animal4);
	
	Lion.start();
	Tiger.start();
	Monkey.start();
	Pig.start();
	
	
	
	
	try {
		Lion.join();
		Tiger.join();
		Monkey.join();
		Pig.join();
		
	} catch (InterruptedException e) {
	}
	
	System.out.println("µ¿¹° ÇÕÁÖ ³¡!!");
	
	
	
	}
}
