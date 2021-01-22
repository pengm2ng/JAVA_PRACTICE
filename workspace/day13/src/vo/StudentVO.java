package vo;

public class StudentVO {
	private	int  num;
	private static int seq;
	private String name;
	private int age;
	
	public StudentVO(){	}
	
	public StudentVO(String name, int age) {
		
		this.num = ++seq;
		this.name = name;
		this.age = age;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
	
			return "번호: "+num +"번\n이름 : "+name +"\n나이: "+age+"살\n";
	}
		
	
}
