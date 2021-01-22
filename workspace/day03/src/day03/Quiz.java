package day03;

import javax.swing.JOptionPane;

public class Quiz {
//퀴즈
	public static void main(String[] args) {
		
		String quest ="다음 중 프로그래밍 언어가 아닌 것은?\n1.JAVA\n2.Python\n3.C언어\n4.망둥어";
		boolean ans=true;
		String result = " ";		
		int num=0;
		int answer=4;
		
		
		
		num=Integer.parseInt(JOptionPane.showInputDialog(quest));
		
		ans = num== answer ? true : false;
			
		result = ans ? "정답입니다." : (answer>0 && answer<4) ? "오답입니다." : "다시 입력해주세요";
		
				JOptionPane.showMessageDialog(null, result);
		
		
		
		
	}
	
	
	
}
