package day02;

import javax.swing.JOptionPane;

public class InputTest2 {

	public static void main(String[] args) {
		
		String namemsg= "�̸��� �Է��ϼ���";
		String agemsg = "���̸� �Է��ϼ���";
		String name=null;
		int age=0;
		name = JOptionPane.showInputDialog(namemsg);
		age = Integer.parseInt(JOptionPane.showInputDialog(agemsg));
		JOptionPane.showMessageDialog(null,"�̸�: "+name+"\n����: "+age+"��");
	
		
	}
	
	
	
	
}
