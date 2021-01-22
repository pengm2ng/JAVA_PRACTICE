package day03;

import javax.swing.JOptionPane;

public class Oper2 {
		
		public static void main(String[] args) {
			
			//대소 비교
			
			int num1=0, num2=0;
			boolean isBigger =true;
			String result ="";
			String n1msg="첫번째 정수를 입력하세요";
			String n2msg="두번째 정수를 입력하세요";
			
			num1=Integer.parseInt(JOptionPane.showInputDialog(n1msg));
			num2=Integer.parseInt(JOptionPane.showInputDialog(n2msg));
			
			isBigger = num1>num2 ? true : false;
			result = isBigger ? "첫번째 정수가 더 큽니다" : num1==num2 ? "두수가 같습니다." : "두번째 정수가 더큽니다.";
			JOptionPane.showMessageDialog(null, result);
			
			
		}
}
