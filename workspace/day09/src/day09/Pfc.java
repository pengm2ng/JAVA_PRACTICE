package day09;

public class Pfc implements Soldier{

	@Override
	public void work() {
		System.out.println("후임들을 잘 관리하며 일을 열심히 한다.");
	}

	@Override
	public void eat() {
		System.out.println("맛있게 후임들을 관리하며 신속하게 먹는다.");
	}

	@Override
	public void sleep() {
		System.out.println("잘 잔다.");
	}

	@Override
	public void play() {
		System.out.println("사지방과 노래방을 이용한다.");
	}

	@Override
	public void salute() {
		System.out.println("충!성!");
	}

	

}
