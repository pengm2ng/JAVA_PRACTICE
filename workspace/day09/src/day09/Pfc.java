package day09;

public class Pfc implements Soldier{

	@Override
	public void work() {
		System.out.println("���ӵ��� �� �����ϸ� ���� ������ �Ѵ�.");
	}

	@Override
	public void eat() {
		System.out.println("���ְ� ���ӵ��� �����ϸ� �ż��ϰ� �Դ´�.");
	}

	@Override
	public void sleep() {
		System.out.println("�� �ܴ�.");
	}

	@Override
	public void play() {
		System.out.println("������� �뷡���� �̿��Ѵ�.");
	}

	@Override
	public void salute() {
		System.out.println("��!��!");
	}

	

}
