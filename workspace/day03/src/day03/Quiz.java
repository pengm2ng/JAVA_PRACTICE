package day03;

import javax.swing.JOptionPane;

public class Quiz {
//����
	public static void main(String[] args) {
		
		String quest ="���� �� ���α׷��� �� �ƴ� ����?\n1.JAVA\n2.Python\n3.C���\n4.���վ�";
		boolean ans=true;
		String result = " ";		
		int num=0;
		int answer=4;
		
		
		
		num=Integer.parseInt(JOptionPane.showInputDialog(quest));
		
		ans = num== answer ? true : false;
			
		result = ans ? "�����Դϴ�." : (answer>0 && answer<4) ? "�����Դϴ�." : "�ٽ� �Է����ּ���";
		
				JOptionPane.showMessageDialog(null, result);
		
		
		
		
	}
	
	
	
}
