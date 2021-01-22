package day07;

public class AccessTest {	
	
		int data1 =10;
		public int data2 =20;
		protected int data3 =30;
		private int data4=40;
		
	
	public	int getData4() {
			
			return this.data4;
		}
	public void setData4(int data4) {
		this.data4=data4;
		
		
		
	}
		
		
		public static void main(String[] args) {
			
		AccessTest at = new AccessTest();
	
			
		}
}
