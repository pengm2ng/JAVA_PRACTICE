package day04;
import javax.swing.JOptionPane;
//�ùķ��̼�
public class Film2 {
	
			public static void main(String[] args) {
				
				String qmsg = "�� ���÷� ������?\n"
						+ "1.�ֿ�~?\n"
						+ "2.�� �����ǵ�?\n"
						+ "3.���� �԰�?\n"
						+ "4.���� �϶� �� �Ծ�?\n"
						+ "5.������\n";
				
				int choice=0;
				int flag=0;
				
				
				
				while(flag!=1) {
				
							choice = Integer.parseInt(JOptionPane.showInputDialog(qmsg));
						
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
												flag=1;
												break;
												
											default:
												JOptionPane.showMessageDialog(null, "�ٽ� �����ٷ�?");
										
						
											}
						
						}
	
	
		}
	}
