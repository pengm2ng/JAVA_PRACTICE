package day16;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.omg.Messaging.SyncScopeHelper;

public class ActionListnerTest extends JFrame implements ActionListener, Runnable{
//시작, 일시정지, 초기화	
	SimpleDateFormat sdf  = new SimpleDateFormat("HH:MM:SS.SSS");
	long start, end;
	JButton startBtn = new JButton("시작");
	JButton pauseBtn = new JButton("일시정지");
	JButton resetBtn = new JButton("초기화");
	boolean flag;

	public ActionListnerTest() {

		
		GridLayout grid = new GridLayout(3,1);
		
	
		setTitle("타이머");
		setSize(300, 500);
		setLayout(grid);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (d.width -getWidth())/2;
		int ypos = (d.height- getHeight())/2;
		
		setLocation(xpos, ypos);
		
		startBtn.addActionListener(this);
		pauseBtn.addActionListener(this);
		resetBtn.addActionListener(this);
		
		
		add(startBtn);
		add(pauseBtn);
		add(resetBtn);
		
		//버튼 비활성화
		pauseBtn.setEnabled(false);
		resetBtn.setEnabled(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new ActionListnerTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Thread thread = new Thread(this);
		
		switch(e.getActionCommand()) {
		case "시작" : case "재시작" :
			thread.start();
			flag = true;
			startBtn.setEnabled(false);
			pauseBtn.setEnabled(true);
			resetBtn.setEnabled(false);
			
			break;
			
		case "일시정지":
			
			startBtn.setEnabled(true);
			pauseBtn.setEnabled(false);
			resetBtn.setEnabled(true);
			startBtn.setLabel("재시작");
			flag = false;
			
			break;
			
		case "초기화" :
			startBtn.setEnabled(true);
			pauseBtn.setEnabled(false);
			resetBtn.setEnabled(false);
			start = 0;
			setTitle(sdf.format(-32400000));
			flag = false;
			startBtn.setText("시작");
			
			break;
		}
	}

	@Override
	public void run() 
	{
		if(start ==0) {
			start = System.currentTimeMillis();
			end = start;
			
		}
		while(true) {
			long time = end++ - start-32400000;
			setTitle(sdf.format(time));
			if(!flag) break;
			try {Thread.sleep(1);} catch(InterruptedException e) {;}
		}
	}

	// 메모장 설명 참고.
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		JButton reset =(JButton)e.getSource();
//		System.out.println(reset.getName());
//	}
//	

	
	
}
