package day08;
import java.util.Scanner;

public class Police extends Person{

	String skill1="총";
	String skill2="방어";
	String skill3="회복";
	int life=5;
	private Scanner sc;
	
	public Police(String name, int age, String gender,  int life) {
		super(name, age, gender);
		this.life = life;
		
	}
	
	void show() {
		
		System.out.println(this.name+" "+this.age+" "+this.gender+" "+this.life);
		
	}
	
	int policeChoice() {
		int x =0;
		System.out.println("Andy가 할 행동은?");
		Scanner sc2= new Scanner(System.in);
		x=sc2.nextInt();
		return x;
		
	}
	
	
	void policeTurn(int policeNum) {
		
		if(policeNum==1) {
			
			
		}
		
		if(policeNum==2) {
			
			
		}
		if(policeNum==3) {
			
			
			
		}
		
		
		
	}
	
	
	
}
