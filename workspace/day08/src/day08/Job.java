package day08;
import java.util.Scanner;

public class Job extends Person {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Num=0;
		
        Person person = new Person();	
		Police police = new Police("°æÂû: Andy" ,20,"³²",5);
		Prisonor prisonor = new Prisonor("Å»¿Á¼ö: Ted" ,25," ³²", 5);
		
		police.show();
		prisonor.show();
		
		person.meet();
		
		while(!(police.life == 0||prisonor.life==0)) {
			
			Num=police.policeChoice();
			police.policeTurn(Num);
			
			
			
			
			
		}
		
		
		
		
		
	}
	
	
	
}

