package day04;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MegaBox {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		String hellomsg = "MEGABOX";
		String errmsg = "�߸� �Է� �ϼ̽��ϴ�.";
		String choicemsg = "\n�翹���ϱ�\n�豸���ϱ�\n������ ���\n�곪����\n";
		String filmmsg = "����̿�ŷ(09:00)\n��˶��(15:00)\n�������(23:00)[û�ҳ� ���� �Ұ�]\n��ڷΰ���\\n";
		String agemsg = "���̸� �Է��ϼ���";
		String ageerrmsg = "û�ҳ� ���� �Ұ� ��ǰ�Դϴ�\n";
		String result = "";
		String foodmsg="������ 8000��\n���ݶ� 3000��\n����� 4000��\n��ڷΰ���\n";
		String cuponmsg = "6�ڸ� ������ȣ�� �Է����ּ���";
		
		boolean cuponCheck =false;
		boolean cuponMenuCheck = false;
		
		int choice = 0;
		int age = 0;
		int money= 1_000_000_000;
		int ticket = 10000;
		int popcorn =8000;
		int coke= 3000;
		int bear = 4000;
		int price=0;
		int cupon = r.nextInt(900000)+100000;
		JOptionPane.showMessageDialog(null, cupon);
		int mycupon=0;
		int flag=0;
		
		
		while (true) {
			
			cuponMenuCheck = false;
			
			System.out.println(hellomsg + choicemsg);
			choice = sc.nextInt();

			if (choice == 4)
				break;

			switch (choice) {

						case 1:
							System.out.println(filmmsg);
							// ������ ����
							// �޸� ������ �����ϳ� �������� ��������.
							choice = sc.nextInt();
							if (choice < 1 || choice > 3)	continue;
			
												switch (choice) {
																				case 1:
																					result = "���̿�ŷ(09:00) ���ſϷ�\n";
																					break;
																				case 2:
																					result ="�˶��(15:00) ���ſϷ�\n";
																				
																					break;
																				case 3:
																					System.out.println(agemsg);
																					age = sc.nextInt();
																					if (age > 19) {
																						result ="������(23:00) ���ſϷ�\n";
																					
																					} else {
																						System.out.println(ageerrmsg);
																					continue;
																					}
																						break;
								
																	}
												price = ticket;
												
							break;
			
						case 2:
							System.out.println(foodmsg);
							choice = sc.nextInt();
							if (choice < 1 || choice > 3)	continue;
							
														switch (choice) {
																				case 1:
																					result = "���� ���� �Ϸ�\n";
																					price =popcorn;
																					break;
																					
																				case 2:
																					result ="�ݶ� ���� �Ϸ�\n";
																					price = coke;
																					break;
																					
																				case 3:
																					System.out.println(agemsg);
																					
																					age = sc.nextInt();
																					
																					if (age > 19) {
																						result ="���� ���� �Ϸ�\n";
																						price = bear;
																					} else {
																						System.out.println(ageerrmsg);
																					continue;
																					}
																					
																					break;
													
											}
									
							break;
			
						case 3:
							
							cuponMenuCheck = true;
							if(flag!=0) {
								System.out.println("������ �̹� ��ϵǾ����ϴ�.");
								break;
							}	
							System.out.println(cuponmsg);		
							mycupon = sc.nextInt();
							
							if(cupon == mycupon && !cuponCheck) {
								
								cuponCheck = true;
								flag++;
							}else 
								{
								System.out.println("�ٽ� �õ��� �ּ���");
						
								}
								
							break;
							
						case 4:
			
							break;
			
						default:
							System.out.println(errmsg);
							continue;

			}
			
			if(cuponCheck) {
				price= (int)(price /2);
				
			}
			if(cuponMenuCheck) continue;
				
		if(money-price<0) {
				System.out.println("�ܾ��� �����մϴ�");
				break;
			}else{
				money = money -  price;
			System.out.println(result);
			System.out.println("���� �ܾ� : " + money +"��\n");
			}
		}

	}
}