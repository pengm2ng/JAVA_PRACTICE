package day03;

import javax.swing.JOptionPane;

public class Oper2 {
		
		public static void main(String[] args) {
			
			//��� ��
			
			int num1=0, num2=0;
			boolean isBigger =true;
			String result ="";
			String n1msg="ù��° ������ �Է��ϼ���";
			String n2msg="�ι�° ������ �Է��ϼ���";
			
			num1=Integer.parseInt(JOptionPane.showInputDialog(n1msg));
			num2=Integer.parseInt(JOptionPane.showInputDialog(n2msg));
			
			isBigger = num1>num2 ? true : false;
			result = isBigger ? "ù��° ������ �� Ů�ϴ�" : num1==num2 ? "�μ��� �����ϴ�." : "�ι�° ������ ��Ů�ϴ�.";
			JOptionPane.showMessageDialog(null, result);
			
			
		}
}
