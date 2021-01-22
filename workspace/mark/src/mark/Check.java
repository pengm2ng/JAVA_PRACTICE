package mark;

public class Check {
	public static void main(String[] args) {
		Digimon d = new Digimon();
		Pokemon p = new Pokemon();
		ZzangGu z = new ZzangGu();
		HarryPortter h = new HarryPortter();
	
		if(d instanceof AnimationMarker) {
			System.out.println("디지몬은 애니메이션입니다.");
		}if(p instanceof AnimationMarker) {
			System.out.println("포켓몬은 애니메이션입니다.");	
		}if(z instanceof AnimationMarker) {
			System.out.println("짱구는 애니메이션입니다.");	
		}if(h instanceof AnimationMarker) {
			System.out.println("해리포터는 애니메이션입니다.");
		}else System.out.println("해리포터는 애니메이션이 아닙니다.");
		
		
		
		
	}
}
