package day09;

public class Private implements Soldier{

	@Override
	public void work() {
		System.out.println("아주 열심히 하지만 결과물이 없다.");
	}

	@Override
	public void eat() {
		System.out.println("90도로 앉아서 90도로 팔을 펴고 신속하게 식사한다.");
	}

	@Override
	public void sleep() {
		System.out.println("고향 생각에 잠을 못이루다 5:50분에 눈이 떠진다.");
	}

	@Override
	public void play() {
		System.out.println("안타깝게도 아직 할 일들이 많아서 잘 놀지 못한다.");
	}

	@Override
	public void salute() {
		System.out.println("충!!!!!!!!!!!!!!!!!성!!!!!!!!!!!!!!!!!");
	}

	
}
