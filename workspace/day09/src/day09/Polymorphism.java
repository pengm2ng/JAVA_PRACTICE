package day09;
import java.util.Random;

class Avengers{
	
	public void fight() {
		
		
	}
	
	
	
}

class IronMan extends Avengers{
	@Override
	public void fight() {
		System.out.println("공기팡!");
	}
	
}

class Hulk extends Avengers{
	
	@Override
	public void fight() {
		System.out.println("초록색 괴물로 변해서 쿵!");
		
	}
	
}

class CaptainAmerica extends Avengers{
	
	@Override
	public void fight() {
	System.out.println("방패 날리기!~");
	}
}

class HawkEye extends Avengers{
	@Override
	public void fight() {
	System.out.println("화살 장전 발사~!");
	}
	
}

class Thor extends Avengers{
	
	@Override
	public void fight() {
		System.out.println("천둥번개 망치 펑!");
	}
}

class BlackWidow extends Avengers{
	
	@Override
	public void fight() {
		System.out.println("총 탕탕탕!");
	}
}

class Loki extends Avengers{
	
	@Override
	public void fight() {
	System.out.println("변신!");
	}
	
}

public class Polymorphism {

	public boolean checkLoki(Avengers a) {
		
		boolean check = true;
		
		
		if(a instanceof IronMan) {
			System.out.println("아이언맨 입장");
		}else if(a instanceof Thor) {
			System.out.println("토르 입장");
		}else if(a instanceof Hulk) {
			System.out.println("헐크 입장");
		}else if(a instanceof HawkEye) {
			System.out.println("호크아이 입장");
		}else if(a instanceof CaptainAmerica) {
			System.out.println("캡틴아메리카 입장");
		}else if(a instanceof BlackWidow) {
			System.out.println("블랙위도우 입장");
		}else if(a instanceof Loki){
			System.out.println("로키 찾음!");
			check = false;
			
		}else {
			System.out.println("악당 찾음!");
		}
		return check;
	}
	
	public static void main(String[] args) {
		Avengers[] avengers = {
				new IronMan(),
				new Thor(),
				new HawkEye(),
				new BlackWidow(),
				new CaptainAmerica(),
				new Hulk(),
				new Loki()
		};
		for (int i = 0; i < 1000; i++) {
			if(!new Polymorphism().checkLoki(avengers[new Random().nextInt(7)])) break;
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {}
			
		
		}
	}
}
