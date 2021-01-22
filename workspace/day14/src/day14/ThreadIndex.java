package day14;

public class ThreadIndex {
		public static void main(String[] args) {
			ThreadTest t1 = new ThreadTest("ㅇ");
			ThreadTest t2 = new ThreadTest("ㅁ");
			ThreadTest2 t3 = new ThreadTest2("!");
			ThreadTest2 t4 = new ThreadTest2("?");
			
			Thread thread1 = new Thread(t3);
			Thread thread2 = new Thread(t4);
			
			thread1.start();
			thread2.start();
			
			//join()
			try {
				thread1.join();
				thread2.join();
			} catch (InterruptedException e) {
			}
			//try catch ->alt + shift + z
			
			System.out.println("메인 메서드의 끝");
			
			//t1.start();
			//t2.start();
			
			
		}
}
