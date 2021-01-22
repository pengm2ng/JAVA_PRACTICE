package day12;

import java.util.ArrayList;

public class User {
	
	ArrayList<ArrayList<String>> arrUser = new ArrayList<>();
	
	//회원 가입 구현
	String join(ArrayList<String> arUser) {
		
		String id = arUser.get(0);
		//String pw = arUser.get(1);
		boolean isDup =false;
		String msg="아이디 중복";
		
		for(ArrayList<String> arData : arrUser) {
			if(arData.get(0).equals(id)) {
				isDup=true;
				break;
			}
		}
		
		if(!isDup) {
			arUser.set(1, encrypt(arUser.get(1)));
			arrUser.add(arUser);
			msg= "회원 가입 성공";
			
		}
		return msg;
	}
	
	String login(String id, String pw) {
		//아이디 오류
		//비밀번호 오류
		//로그인 성공
		
		boolean idCheck = false;
		boolean pwCheck = true;
		String msg ="아이디 오류";
		
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
			msg= "로그인 성공";
		}else if(idCheck&& !pwCheck) {
			
			msg="비밀번호 오류";
		}
		
		
		return msg;
		
	}
	
	
	//암호화 기능 구현
	String encrypt(String pw) {
		String result="";
		
		for (int i = 0; i < pw.length(); i++) {
			result += "" + (char)(pw.charAt(i) * 2);
		}
		
		return result;
	}
	
	
	//암호화 복구
	String decrypt(String pw) {
		String result="";
		
		for (int i = 0; i < pw.length(); i++) {
			result += "" + (char)(pw.charAt(i) /2);
		}
		
		return result;
		
	}
}
