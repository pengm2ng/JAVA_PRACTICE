package day08;
import java.util.Scanner;

public class Prisonor extends Person{

	String skill1="��";
	String skill2="���";
	String skill3="����";
	int life=5;
	private Scanner sc;
	
	public Prisonor(String name, int age, String gender,int life) {
		super(name, age, gender);
		this.life = life;
		
	}
	
void show() {
		
		System.out.println(this.name+" "+this.age+" "+this.gender+" "+this.life);
		
	}

int prisonorChoice() {
	int y=0;
	
	System.out.println("Ted�� �� �ൿ��?");
	Scanner sc2= new Scanner(System.in);
	y=sc2.nextInt();
	return y;

}


	
void prisonorTurn(int prisonorNum) {
		
		
	
	
		if(prisonorNum==1) {
			
			
		}
		
		if(prisonorNum==2) {
			
			
		}
		if(prisonorNum==3) {
			
			
			
		}
		
		
		
	}

	
	
	
	
}
