package day06;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class New_MegaBox {
	String agemsg = "나이를 입력하세요";
	String ageerrmsg = "청소년 구매 불가 상품입니다\n";
	int money= 1_000_000_000;
	
	
	
	void bookTicket(String filmmsg){
		
		int ticket = 10000;
		Scanner sc = new Scanner(System.in);
		System.out.println(filmmsg);	
		int choice = sc.nextInt();
		String result="";
		int age =0 ;
		boolean checkBooking=true;
		
		
							switch (choice) {
															case 1:
																result = "라이온킹(09:00) 예매완료\n";
																break;
															case 2:
																result ="알라딘(15:00) 예매완료\n";
															
																break;
															case 3:
																System.out.println(agemsg);
																age = sc.nextInt();
																if (checkAge(age)) {
																	result ="악인전(23:00) 예매완료\n";
																
																} else {
																	System.out.println(ageerrmsg);
																	checkBooking = false;
															
																}
																	break;
															default:
																
																checkBooking = false;
																result ="메인메뉴로 이동합니다.";
												}
							if(checkBooking && money-ticket>=0) {
								
								pay(ticket);
								System.out.println("현재 잔액 : " + money +"원\n");
							
							}else {System.out.println("다시시도해주세요");}
							
							System.out.println(result);
	}
	
	void pay(int price) {
		money = money -  price;
		
	}
	
	
	
	
	
	
	
	
	
	
	boolean checkAge(int age) {
	boolean check =false;
		if(age>19) {
			check=true;
		}
		return check;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		String hellomsg = "MEGABOX";
		String errmsg = "잘못 입력 하셨습니다.";
		String choicemsg = "\n①예매하기\n②구매하기\n③쿠폰 등록\n④나가기\n";
		String filmmsg = "①라이온킹(09:00)\n②알라딘(15:00)\n③악인전(23:00)[청소년 관람 불가]\n④뒤로가기\\n";
		String result = "";
		String foodmsg="①팝콘 8000원\n②콜라 3000원\n③맥주 4000원\n④뒤로가기\n";
		String cuponmsg = "6자리 쿠폰번호를 입력해주세요";
		
		boolean cuponCheck =false;
		boolean cuponMenuCheck = false;
		
		int choice = 0;
		int age = 0;
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
						
							break;
			
						case 2:
							System.out.println(foodmsg);
							choice = sc.nextInt();
							if (choice < 1 || choice > 3)	continue;
							
														switch (choice) {
																				case 1:
																					result = "팝콘 구매 완료\n";
																					price =popcorn;
																					break;
																					
																				case 2:
																					result ="콜라 구매 완료\n";
																					price = coke;
																					break;
																					
																				case 3:
																					System.out.println(agemsg);
																					
																					age = sc.nextInt();
																					
																					if (age > 19) {
																						result ="맥주 구매 완료\n";
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
								System.out.println("쿠폰이 이미 등록되었습니다.");
								break;
							}	
							System.out.println(cuponmsg);		
							mycupon = sc.nextInt();
							
							if(cupon == mycupon && !cuponCheck) {
								
								cuponCheck = true;
								flag++;
							}else 
								{
								System.out.println("다시 시도해 주세요");
						
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
	
			System.out.println(result);
			
			}
		}

	}
}
