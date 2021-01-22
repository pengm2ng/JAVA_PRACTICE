package day02;

import javax.swing.JOptionPane;

public class InputTest2 {

	public static void main(String[] args) {
		
		String namemsg= "이름을 입력하세요";
		String agemsg = "나이를 입력하세요";
		String name=null;
		int age=0;
		name = JOptionPane.showInputDialog(namemsg);
		age = Integer.parseInt(JOptionPane.showInputDialog(agemsg));
		JOptionPane.showMessageDialog(null,"이름: "+name+"\n나이: "+age+"살");
	
		
	}
	
	
	
	
}
