package day09;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class ExceptionTest {
public static void main(String[] args) {
	try {
		Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하세요"));
	} catch (Exception e) {
		System.out.println("정수만 입력해주세요");
		System.out.println(e.getMessage());
	} 
	System.out.println("반드시 출력되어야 하는 문장");
}
}
