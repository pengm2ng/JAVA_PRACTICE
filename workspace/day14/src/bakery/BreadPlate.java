package bakery;

//���� �� �Ϸ翡 20��
//10���� ��������� ��ٸ���.
//���� ������ ��ٸ��� �ִ� �����带 �����ش�.


public class BreadPlate {
		
		private int breadCnt;
		private int eatCnt;
		
		public synchronized void makeBread() {
			if(breadCnt > 9) {
				try {
					System.out.println("���� ���� á���ϴ�.");
					wait();
				} catch (InterruptedException e) {
				}
			}
			breadCnt++;
			System.out.println("���� 1�� ��������ϴ�. �� : " + breadCnt +"��");
		}
		
		public synchronized void eatBread() {
			if(eatCnt==20) {
				System.out.println("���� �� ���������ϴ�.");
			}else if(breadCnt<1) {
				System.out.println("���� �����ϴ�. ���� �� ���� ��ٷ� �ּ���");
			}else {
				breadCnt--;
				eatCnt++;
				System.out.println("���� 1�� �Ծ����ϴ�. ��: "+breadCnt +"��");
				//��� �������� �˾ƾ��ϱ� ������ this�� ��� this�� ����?
				
				this.notify();
				
				
			}
			
		}
		
		
		
		
		
		
}
