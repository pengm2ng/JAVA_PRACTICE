package day05;

import javax.swing.JOptionPane;

//����Ű
		//������a, ������a, ȫ����a
		//������k, ������k, ȫ����k
public class Arrtask {
public static void main(String[] args) {
	String [][] arrName = { {"������A", "������A", "ȫ����A"},
										 {"������K","������K","ȫ����K"}};
	
	String [] ageName = {"������", "Ű����"};
	String [] branchName = {"������", "������","ȫ����"};
	
	int [][] arrIncome = new int[2][3];
	int [] ageSum = new int[2];
	int [] branchSum = new int [3];
	int sum=0;
	double [] ageAvg = new double[2];
	double [] branchAvg = new double[3];
	double avg=0;
	String result = "";
	
	
	for(int i=0; i<arrIncome.length; i++) {
		
		for(int j=0; j<arrIncome[0].length; j++){
			
		arrIncome[i][j]= Integer.parseInt(JOptionPane.showInputDialog(arrName[i][j]+
				"���� ������� �Է��ϼ���.(���� : ����)"));
			
		ageSum[i]+=arrIncome[i][j];
		branchSum[j] +=  arrIncome[i][j]	;
		sum += arrIncome[i][j];
		}
		
		ageAvg[i] = Double.parseDouble(String.format("%.2f",(double)ageSum[i]/ arrIncome[0].length));
		
		
	}
	
	for (int j = 0; j < arrIncome[0].length; j++) {
		
		branchAvg[j] = Double.parseDouble(String.format("%.2f",(double)branchSum[j]/ arrIncome.length));
		
	}
		
		avg = Double.parseDouble(String.format("%.2f", (double)sum/(arrIncome.length*arrIncome[0].length)));
	
	for (int i = 0; i < arrIncome.length; i++) {
		for (int j = 0; j < arrIncome[0].length; j++) {
			
			result += arrName[i][j]+"���� ����� : "+ arrIncome[i][j] + "����\n";
			
			
		}
		result += ageName[i]+ "����� : "+ageSum[i] + "����\n";
		result += ageName[i]+ "����� : "+ageAvg[i] + "����\n";
		result +="---------------------------------------------------------------\n";
		
	}
		for (int i = 0;  i< 3;i ++) {
			result += branchName[i] + "����� : "+ branchSum[i]+"����\n";
			result += branchName[i] + "����� : "+ branchAvg[i]+"����\n";
			
		}
		result +="---------------------------------------------------------------\n";
		result += "����Ű �� ����� : "+sum+"����\n";
		result += "����Ű ��� ����� : "+avg+"����";
		
		JOptionPane.showMessageDialog(null, result);
	
	}
}
