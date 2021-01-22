package day09;

public class Sergeant extends Army {

	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("밥을 먹지 않고 px로 질주한다.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("하루종일");
	}

	void clerk() {
		System.out.println("은신");
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("놀지 않고 공부한다.");
	}

	@Override
	public void salute() {
		// TODO Auto-generated method stub
		System.out.println("ㅊ");
	}

}
