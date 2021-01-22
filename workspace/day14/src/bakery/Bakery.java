package bakery;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Bakery {
	public static void main(String[] args) {
		BreadPlate bread = new BreadPlate();
		BreadMaker maker= new BreadMaker(bread);
		Thread makerThread = new Thread(maker);
		String[] arBtn = {"���Ա�", "���� �� ���������"};
		
		ImageIcon icon = new ImageIcon("img/toaster.gif");
		
		makerThread.start();
		
		while(true) {
		int choice = JOptionPane.showOptionDialog(null, "", "�����ٰ�Ʈ",
				JOptionPane.DEFAULT_OPTION, 
				JOptionPane.PLAIN_MESSAGE,icon, arBtn, null);
		
		if(choice==0) {
			bread.eatBread();			
		}else {
			break;
		}
			
			
		
		}
		System.out.println("���� Closed");
	}
	
	
}
