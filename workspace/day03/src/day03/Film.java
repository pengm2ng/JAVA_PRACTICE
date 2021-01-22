package day03;

import javax.swing.JOptionPane;
//시뮬레이션
public class Film {
		public static void main(String[] args) {
			
			String qmsg = "술 마시러 갈래요?\n"
					+ "1.왜요~?\n"
					+ "2.뭘 먹을건데?\n"
					+ "3.술만 먹게?\n"
					+ "4.내가 니랑 왜 먹어?"
					+ "5.나가기";
			int choice=0;
			
			choice = Integer.parseInt(JOptionPane.showInputDialog(qmsg));
			
			while(choice!=5) {
			switch(choice) {
			
			case 1: 
				JOptionPane.showMessageDialog(null, "애인이랑 헤어져서");
				break;

			case 2: 
				JOptionPane.showMessageDialog(null, "일단 가서 생각하자");
				break;
			
			case 3: 
				JOptionPane.showMessageDialog(null, "원하는게 뭐야");
				break;
			
			case 4:
				JOptionPane.showMessageDialog(null, "너 아니면 누구랑 먹어");
				break;
			
			case 5:
				JOptionPane.showMessageDialog(null, "종료합니다.");
			default:
				JOptionPane.showMessageDialog(null, "다시 말해줄래?");
							
			
			}
			
			}
			
			
		/*	if(choice==1) {
			}else if(choice==2) {
				
				
			}else if(choice==3) {
				
			}else if(choice==4) {
				
			}else {
				
			}
			*/
			
			
		}
}
