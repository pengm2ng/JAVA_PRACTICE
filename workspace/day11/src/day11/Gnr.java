package day11;

public class Gnr {
 public static void main(String[] args) {
	//������ �κ��� ���׸����� Ÿ���� ������ �� �ִ�.
	 GenericClassTest<String> gt = new GenericClassTest<>();
	gt.setData("90");
	System.out.println(gt.getData());
	
	System.out.println(GenericMethodTest.function(new Integer(10)));
 }
}
