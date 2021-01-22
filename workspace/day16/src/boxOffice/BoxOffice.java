package boxOffice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public class  BoxOffice extends JFrame implements ActionListener{
	
	TextArea box = new TextArea(BoxOfficeView.getContent());
	TextArea searchArea = new TextArea("검색 : Ctrl, 삭제 : 버튼 클릭");
	JButton deleteBtn = new JButton("삭제");
	
	public BoxOffice() {
		setLayout(new BorderLayout());
			JScrollPane scroll = new JScrollPane();
			
			setTitle("박스 오피스 역대 순위");
			setSize(800, 800);
			Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
			
			int x =(d.width-getWidth())/2;
			int y= (d.height-getHeight())/2;
			
			setLocation(x,y);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			deleteBtn.setFont(new Font("D2Coding", Font.BOLD, 40));
			deleteBtn.addActionListener(this);
			box.setBackground(Color.WHITE);
			box.setFont(new Font("D2Coding", Font.BOLD, 15));
			box.setEditable(false);
			scroll.setViewportView(box);
			//scrollpanel은 jframe 뒤로 숨지 않는ek.
			getContentPane().add(scroll);
			
			searchArea.setPreferredSize(new Dimension(getWidth(),100));
			searchArea.setFont(new Font("D2Coding", Font.BOLD, 15));
			
			add(searchArea, BorderLayout.NORTH);
			add(deleteBtn, BorderLayout.SOUTH);
			scrol
			deleteBtn.setBackground(Color.BLACK);
			deleteBtn.setForeground(Color.WHITE);
			setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)  {

		try {
			filmDelete(searchArea.getText());
		} catch (IOException e1) {
			// TODO Aut-generated catch block
			e1.printStackTrace();
		}
		box.setText(BoxOfficeView.getContent());
		revalidate();
	}
	
	void filmSearch() {
		String keyword = searchArea.getText();
		String[] arLine = new String[500];
		
		arLine = BoxOfficeView.getContent().split("\n");
		for(int i=0; i<arLine.length; i++) {
			if(arLine[i].contains(keyword)) {
		searchArea.setText(arLine[i]+"\r\n");		
			}
		}
	}
	
	void filmDelete(String keyword) throws IOException {
		File file = new File("test.txt");
		FileReader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		String line ="";
		String temp = "";
		
		while(true) {
			line = br.readLine();
			if(line == null)break;
			if(line.contains(keyword)) continue;
			temp += line + "\r\n";
		}
		br.close();
		FileWriter fw = new FileWriter("test.txt");
		fw.write(temp);
		fw.close();
		
		BoxOfficeView.setContent(temp);
		
	}
}
