package day11;

public class Gnr {
 public static void main(String[] args) {
	//생성자 부분의 제네리에는 타입을 생략할 수 있다.
	 GenericClassTest<String> gt = new GenericClassTest<>();
	gt.setData("90");
	System.out.println(gt.getData());
	
	System.out.println(GenericMethodTest.function(new Integer(10)));
 }
}
