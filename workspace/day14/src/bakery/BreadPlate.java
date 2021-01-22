package bakery;

//빵을 총 하루에 20개
//10개가 만들어지면 기다린다.
//빵을 먹으면 기다리고 있는 스레드를 깨워준다.


public class BreadPlate {
		
		private int breadCnt;
		private int eatCnt;
		
		public synchronized void makeBread() {
			if(breadCnt > 9) {
				try {
					System.out.println("빵이 가득 찼습니다.");
					wait();
				} catch (InterruptedException e) {
				}
			}
			breadCnt++;
			System.out.println("빵을 1개 만들었습니다. 총 : " + breadCnt +"개");
		}
		
		public synchronized void eatBread() {
			if(eatCnt==20) {
				System.out.println("빵이 다 떨어졌습니다.");
			}else if(breadCnt<1) {
				System.out.println("빵이 없습니다. 만들 때 까지 기다려 주세요");
			}else {
				breadCnt--;
				eatCnt++;
				System.out.println("빵을 1개 먹었습니다. 총: "+breadCnt +"개");
				//어느 빵집인지 알아야하기 때문에 this를 사용 this가 생략?
				
				this.notify();
				
				
			}
			
		}
		
		
		
		
		
		
}
