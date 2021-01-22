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
//����, �Ͻ�����, �ʱ�ȭ	
	SimpleDateFormat sdf  = new SimpleDateFormat("HH:MM:SS.SSS");
	long start, end;
	JButton startBtn = new JButton("����");
	JButton pauseBtn = new JButton("�Ͻ�����");
	JButton resetBtn = new JButton("�ʱ�ȭ");
	boolean flag;

	public ActionListnerTest() {

		
		GridLayout grid = new GridLayout(3,1);
		
	
		setTitle("Ÿ�̸�");
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
		
		//��ư ��Ȱ��ȭ
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
		case "����" : case "�����" :
			thread.start();
			flag = true;
			startBtn.setEnabled(false);
			pauseBtn.setEnabled(true);
			resetBtn.setEnabled(false);
			
			break;
			
		case "�Ͻ�����":
			
			startBtn.setEnabled(true);
			pauseBtn.setEnabled(false);
			resetBtn.setEnabled(true);
			startBtn.setLabel("�����");
			flag = false;
			
			break;
			
		case "�ʱ�ȭ" :
			startBtn.setEnabled(true);
			pauseBtn.setEnabled(false);
			resetBtn.setEnabled(false);
			start = 0;
			setTitle(sdf.format(-32400000));
			flag = false;
			startBtn.setText("����");
			
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

	// �޸��� ���� ����.
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		JButton reset =(JButton)e.getSource();
//		System.out.println(reset.getName());
//	}
//	

	
	
}
