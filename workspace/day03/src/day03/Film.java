package day03;

import javax.swing.JOptionPane;
//�ùķ��̼�
public class Film {
		public static void main(String[] args) {
			
			String qmsg = "�� ���÷� ������?\n"
					+ "1.�ֿ�~?\n"
					+ "2.�� �����ǵ�?\n"
					+ "3.���� �԰�?\n"
					+ "4.���� �϶� �� �Ծ�?"
					+ "5.������";
			int choice=0;
			
			choice = Integer.parseInt(JOptionPane.showInputDialog(qmsg));
			
			while(choice!=5) {
			switch(choice) {
			
			case 1: 
				JOptionPane.showMessageDialog(null, "�����̶� �������");
				break;

			case 2: 
				JOptionPane.showMessageDialog(null, "�ϴ� ���� ��������");
				break;
			
			case 3: 
				JOptionPane.showMessageDialog(null, "���ϴ°� ����");
				break;
			
			case 4:
				JOptionPane.showMessageDialog(null, "�� �ƴϸ� ������ �Ծ�");
				break;
			
			case 5:
				JOptionPane.showMessageDialog(null, "�����մϴ�.");
			default:
				JOptionPane.showMessageDialog(null, "�ٽ� �����ٷ�?");
							
			
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
