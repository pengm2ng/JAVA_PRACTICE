package day09;

public class Private implements Soldier{

	@Override
	public void work() {
		System.out.println("���� ������ ������ ������� ����.");
	}

	@Override
	public void eat() {
		System.out.println("90���� �ɾƼ� 90���� ���� ��� �ż��ϰ� �Ļ��Ѵ�.");
	}

	@Override
	public void sleep() {
		System.out.println("���� ������ ���� ���̷�� 5:50�п� ���� ������.");
	}

	@Override
	public void play() {
		System.out.println("��Ÿ���Ե� ���� �� �ϵ��� ���Ƽ� �� ���� ���Ѵ�.");
	}

	@Override
	public void salute() {
		System.out.println("��!!!!!!!!!!!!!!!!!��!!!!!!!!!!!!!!!!!");
	}

	
}
