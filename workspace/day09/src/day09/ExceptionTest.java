package day09;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class ExceptionTest {
public static void main(String[] args) {
	try {
		Integer.parseInt(JOptionPane.showInputDialog("������ �Է��ϼ���"));
	} catch (Exception e) {
		System.out.println("������ �Է����ּ���");
		System.out.println(e.getMessage());
	} 
	System.out.println("�ݵ�� ��µǾ�� �ϴ� ����");
}
}
