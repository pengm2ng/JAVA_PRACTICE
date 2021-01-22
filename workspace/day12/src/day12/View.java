package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class View {

	
		void view() {
			User user = new User();
			String menu = "1.회원가입\n2.로그인\n3.나가기";
			Scanner sc = new Scanner(System.in);
			int choice =0;
			String errMsg="다시 입력해주세요.";
			
			while(true) {
				ArrayList<String> arUser = new ArrayList<>();			
				System.out.println(menu);
			choice = sc.nextInt();
			
			if(choice==3) break;
			
			switch(choice) {
			
			case 1:
				System.out.println("아이디 : ");
				arUser.add(sc.next());
				
				
				System.out.println("패스워드 : ");
				arUser.add(sc.next());
				
				System.out.println(user.join(arUser));
				
				
				break;
				
			case 2:
				System.out.println("아이디와 패스워드를 공백으로 구분하여 입력\n예)아이디 패스워드");
					

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
