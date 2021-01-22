package day09;

public class Corporal implements Soldier {

	@Override
	public void work() {
		System.out.println("후임들에게 잘 시킨다.");
	}

	@Override
	public void eat() {
		System.out.println("경치를 보면서 먹는다.");
	}

	@Override
	public void sleep() {
		System.out.println("편하게 잔다.");
	}

	@Override
	public void play() {
		System.out.println("신나게 논다.");
	}

	@Override
	public void salute() {
		System.out.println("ㅊㅅ");
	}

}
