package gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowTest {
	public static void main(String[] args) {
		Frame window = new Frame("제목 있는 윈도우");
		window.setTitle("제목 변경된 윈도우");
		window.setBounds(1200, 200, 400, 300);
		window.setBackground(Color.GREEN);
		
		window.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				window.dispose();;
			}
		});
		
		window.setVisible(true);
		
		Frame window2 = new Frame("제목 있는 윈도우");
		window2.setTitle("제목 변경된 윈도우");
		window2.setBounds(600, 200, 400, 300);
		window2.setBackground(Color.GREEN);
		
		window2.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				window2.dispose();
			}
		});
		
		window2.setVisible(true);
		
		
		
	}
}
