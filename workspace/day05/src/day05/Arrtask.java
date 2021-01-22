package day05;

import javax.swing.JOptionPane;

//나이키
		//강남점a, 신촌점a, 홍대점a
		//강남점k, 신촌점k, 홍대점k
public class Arrtask {
public static void main(String[] args) {
	String [][] arrName = { {"강남점A", "신촌점A", "홍대점A"},
										 {"강남점K","신촌점K","홍대점K"}};
	
	String [] ageName = {"성인점", "키즈점"};
	String [] branchName = {"강남점", "신촌점","홍대점"};
	
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
				"지점 매출액을 입력하세요.(단위 : 만원)"));
			
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
			
			result += arrName[i][j]+"지점 매출액 : "+ arrIncome[i][j] + "만원\n";
			
			
		}
		result += ageName[i]+ "매출액 : "+ageSum[i] + "만원\n";
		result += ageName[i]+ "매출액 : "+ageAvg[i] + "만원\n";
		result +="---------------------------------------------------------------\n";
		
	}
		for (int i = 0;  i< 3;i ++) {
			result += branchName[i] + "매출액 : "+ branchSum[i]+"만원\n";
			result += branchName[i] + "매출액 : "+ branchAvg[i]+"만원\n";
			
		}
		result +="---------------------------------------------------------------\n";
		result += "나이키 총 매출액 : "+sum+"만원\n";
		result += "나이키 평균 매출액 : "+avg+"만원";
		
		JOptionPane.showMessageDialog(null, result);
	
	}
}
