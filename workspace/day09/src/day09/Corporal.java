package day09;

public class Corporal implements Soldier {

	@Override
	public void work() {
		System.out.println("���ӵ鿡�� �� ��Ų��.");
	}

	@Override
	public void eat() {
		System.out.println("��ġ�� ���鼭 �Դ´�.");
	}

	@Override
	public void sleep() {
		System.out.println("���ϰ� �ܴ�.");
	}

	@Override
	public void play() {
		System.out.println("�ų��� ���.");
	}

	@Override
	public void salute() {
		System.out.println("����");
	}

}
