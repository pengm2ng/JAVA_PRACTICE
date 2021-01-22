package dao;

import java.security.KeyStore.Entry;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

import vo.StudentVO;

public class StudentDAO {
	//학생과 점수 맵(DB)
	private HashMap<StudentVO , List<Integer> > smsMap = new HashMap<>();
	private String[] arSubject = {"국어","영어","수학"};
	private StudentVO student;
	
	//학생 정보와 점수 등록
	public void insert(String name, int age, List<Integer> arScore) {
	// 생성자를 통해서 학생 등록후 db에 저장
		//db에 저장하지 않으면 결국 마지막에 등록한 학생만 저장된다.
		student = new StudentVO(name,age);
		smsMap.put(student, arScore);
	}
	
	//학생 정보 수정
	public String update(int num,String name, int age) {
		String result = "수정 성공";
		//번호로 학생 검색 후 전역벼누인 student에 학생 객체 저장
		//검색 결과 x, null이 저장
		select(num);
		
		if(student.equals(null)) {
			result = "수정 실패";
			
		}else {
			student.setAge(age);
			student.setName(name);
		}
		return result;
		
	}
	
	//학생 점수 수정
	public String update(int num, List<Integer> arscore) {
		String result = "수정 성공";
		select(num);
		if(student.equals(null))result = "수정 실패";
		else{
//			for(int i =0; i<arscore.size();i++) {
//				
//				smsMap.get(student).set(i, arscore.get(i));
//			}
			smsMap.replace(student, arscore);
		}
		return result;
	}
	
	//학생 정보 삭제
	public String delete(int num) {
			Iterator<StudentVO> iter = smsMap.keySet().iterator();
			String result ="삭제 실패";
			while(iter.hasNext()) {
				student = iter.next();
				if(student.getNum()==num) {
					smsMap.remove(student);
					result ="삭제 성공";
					break;
				}
		}	
			return result;
	}
	
	//검색
	public void select(int num) {
		student =null;
		Iterator<StudentVO> iter = smsMap.keySet().iterator();
		StudentVO temp;
		while(iter.hasNext()) {
			temp = iter.next();
			if(temp.getNum()==num) {
				student = temp;
				break;
			}
		}
	
	}
	
	
	
	public String select(String name) {
		Iterator<StudentVO> iter = smsMap.keySet().iterator();
		ArrayList<StudentVO> arstd = new ArrayList<>();
		
		while(iter.hasNext()) {
			student = iter.next();
			if(student.getName().equals(name)) {
				arstd.add(student);
			}
		}
	return	list(arstd);
	}
	
	
	public String list() {
		Iterator<java.util.Map.Entry<StudentVO, List<Integer>>> iter = smsMap.entrySet().iterator();
		String result ="";
		int index =0;
		
		if(smsMap.size()==0) {
			result = "목록 없음";
		}
			
		while(iter.hasNext()) {
			java.util.Map.Entry<StudentVO, List<Integer>> e = iter.next();
			
			//toString VO단에서 재정의함.
			result += e.getKey();
			for(int score : e.getValue()) {
				result += arSubject[index] + " : "+score +"점\n";
				index++;
			}
			index=0;
		}
		return result;
	}
	
	//리스트 오버라이딩
	public String list(ArrayList<StudentVO> arstudent) {
		String result= "";
		int index =0;
		if(arstudent.size()==0) result = "검색 결과 없음";
		
		for(int i=0; i<arstudent.size(); i++) {
			result += arstudent.get(i);
			for(int score : smsMap.get(arstudent.get(i))) {
				result += arSubject[index]+" : "+score+"점\n";
				index++;
			}
			index=0;
		} 
		return result;
	}
	
	public void view() {
		Scanner sc =new Scanner(System.in);
		
		do {
			System.out.println("1.학생등록\n" + 
					"2.학생목록\n" + 
					"3.학생검색\n" + 
					"4.학생수정\n" + 
					"5.학생삭제\n" + 
					"6.나가기");
		
			int choice =0;
			choice = sc.nextInt();
			String name;
			int age,num;
			List<Integer> arScore = new ArrayList<>();

			if(choice ==6) break;
			
			switch(choice) {
			case 1:
				arScore = new ArrayList<>();
				System.out.print("학생이름 : ");
				name = sc.next();
				System.out.print("학생나이 : ");
				age = sc.nextInt();
				
				System.out.print("학생점수(국어, 영어, 수학)");
				for(int i =0; i<arSubject.length; i++) {
					arScore.add(sc.nextInt());
				}
				
				insert(name, age, arScore);
				
				break;
				
			case 2:
				
				System.out.println(list());
				
				break;
				
			case 3:
				System.out.print("검색할 학생의 이름입력 : ");
				System.out.print(select(sc.next()));
				break;
				
			case 4:
				arScore = new ArrayList<>();
				System.out.println("1.정보수정\n2.점수수정");
				choice = sc.nextInt();
				if(choice <1 || choice > 2) break;
				
				System.out.println("학생 번호 입력 : ");
				num = sc.nextInt();
				
				switch(sc.nextInt()) {
				case 1:
					System.out.println("새로운 이름 : ");
					name = sc.next();
					System.out.println("새로운 나이 : ");
					age = sc.nextInt();
					System.out.println(update(num, name, age));
					break;
				case 2:
					System.out.println("새로운 점수 입력(국어, 영어, 수학");
					for(int i=0; i<arSubject.length; i++) {
						arScore.add(sc.nextInt());
						
					}
					System.out.println(update(num, arScore));
					break;
				}
				break;
				
			case 5:
				System.out.println("삭제하실 학생의 번호 : ");
				num = sc.nextInt();
				
				System.out.println(delete(num));
				break;
		default : 
			System.out.println("다시 시도해 주세요.");
		}
	}while(true);
		
		
	}
	
	
	
	
	
}
