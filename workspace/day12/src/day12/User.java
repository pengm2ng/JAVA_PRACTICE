package day12;

import java.util.ArrayList;

public class User {
	
	ArrayList<ArrayList<String>> arrUser = new ArrayList<>();
	
	//ȸ�� ���� ����
	String join(ArrayList<String> arUser) {
		
		String id = arUser.get(0);
		//String pw = arUser.get(1);
		boolean isDup =false;
		String msg="���̵� �ߺ�";
		
		for(ArrayList<String> arData : arrUser) {
			if(arData.get(0).equals(id)) {
				isDup=true;
				break;
			}
		}
		
		if(!isDup) {
			arUser.set(1, encrypt(arUser.get(1)));
			arrUser.add(arUser);
			msg= "ȸ�� ���� ����";
			
		}
		return msg;
	}
	
	String login(String id, String pw) {
		//���̵� ����
		//��й�ȣ ����
		//�α��� ����
		
		boolean idCheck = false;
		boolean pwCheck = true;
		String msg ="���̵� ����";
		
		for(ArrayList<String> arData: arrUser) {
			
			if(arData.get(0).equals(id)) {
				idCheck = true;
				pwCheck=false;
				
				if(decrypt(arData.get(1)).equals(pw)){
					pwCheck = true;
					break;
				}
				
			}
		}
		
		if(idCheck && pwCheck) {
			msg= "�α��� ����";
		}else if(idCheck&& !pwCheck) {
			
			msg="��й�ȣ ����";
		}
		
		
		return msg;
		
	}
	
	
	//��ȣȭ ��� ����
	String encrypt(String pw) {
		String result="";
		
		for (int i = 0; i < pw.length(); i++) {
			result += "" + (char)(pw.charAt(i) * 2);
		}
		
		return result;
	}
	
	
	//��ȣȭ ����
	String decrypt(String pw) {
		String result="";
		
		for (int i = 0; i < pw.length(); i++) {
			result += "" + (char)(pw.charAt(i) /2);
		}
		
		return result;
		
	}
}
