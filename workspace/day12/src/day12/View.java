package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class View {

	
		void view() {
			User user = new User();
			String menu = "1.ȸ������\n2.�α���\n3.������";
			Scanner sc = new Scanner(System.in);
			int choice =0;
			String errMsg="�ٽ� �Է����ּ���.";
			
			while(true) {
				ArrayList<String> arUser = new ArrayList<>();			
				System.out.println(menu);
			choice = sc.nextInt();
			
			if(choice==3) break;
			
			switch(choice) {
			
			case 1:
				System.out.println("���̵� : ");
				arUser.add(sc.next());
				
				
				System.out.println("�н����� : ");
				arUser.add(sc.next());
				
				System.out.println(user.join(arUser));
				
				
				break;
				
			case 2:
				System.out.println("���̵�� �н����带 �������� �����Ͽ� �Է�\n��)���̵� �н�����");
					

				System.out.println(user.login(sc.next(), sc.next()));
			
				break;
			
			default :
				
				System.out.println(errMsg);
				break;
			
			}		
		}
	}
		
		public static void main(String[] args) {
			new View().view();
		}
		
}
