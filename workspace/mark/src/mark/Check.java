package mark;

public class Check {
	public static void main(String[] args) {
		Digimon d = new Digimon();
		Pokemon p = new Pokemon();
		ZzangGu z = new ZzangGu();
		HarryPortter h = new HarryPortter();
	
		if(d instanceof AnimationMarker) {
			System.out.println("�������� �ִϸ��̼��Դϴ�.");
		}if(p instanceof AnimationMarker) {
			System.out.println("���ϸ��� �ִϸ��̼��Դϴ�.");	
		}if(z instanceof AnimationMarker) {
			System.out.println("¯���� �ִϸ��̼��Դϴ�.");	
		}if(h instanceof AnimationMarker) {
			System.out.println("�ظ����ʹ� �ִϸ��̼��Դϴ�.");
		}else System.out.println("�ظ����ʹ� �ִϸ��̼��� �ƴմϴ�.");
		
		
		
		
	}
}
