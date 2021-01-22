package day09;
import java.util.Random;

class Avengers{
	
	public void fight() {
		
		
	}
	
	
	
}

class IronMan extends Avengers{
	@Override
	public void fight() {
		System.out.println("������!");
	}
	
}

class Hulk extends Avengers{
	
	@Override
	public void fight() {
		System.out.println("�ʷϻ� ������ ���ؼ� ��!");
		
	}
	
}

class CaptainAmerica extends Avengers{
	
	@Override
	public void fight() {
	System.out.println("���� ������!~");
	}
}

class HawkEye extends Avengers{
	@Override
	public void fight() {
	System.out.println("ȭ�� ���� �߻�~!");
	}
	
}

class Thor extends Avengers{
	
	@Override
	public void fight() {
		System.out.println("õ�չ��� ��ġ ��!");
	}
}

class BlackWidow extends Avengers{
	
	@Override
	public void fight() {
		System.out.println("�� ������!");
	}
}

class Loki extends Avengers{
	
	@Override
	public void fight() {
	System.out.println("����!");
	}
	
}

public class Polymorphism {

	public boolean checkLoki(Avengers a) {
		
		boolean check = true;
		
		
		if(a instanceof IronMan) {
			System.out.println("���̾�� ����");
		}else if(a instanceof Thor) {
			System.out.println("�丣 ����");
		}else if(a instanceof Hulk) {
			System.out.println("��ũ ����");
		}else if(a instanceof HawkEye) {
			System.out.println("ȣũ���� ����");
		}else if(a instanceof CaptainAmerica) {
			System.out.println("ĸƾ�Ƹ޸�ī ����");
		}else if(a instanceof BlackWidow) {
			System.out.println("�������� ����");
		}else if(a instanceof Loki){
			System.out.println("��Ű ã��!");
			check = false;
			
		}else {
			System.out.println("�Ǵ� ã��!");
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
