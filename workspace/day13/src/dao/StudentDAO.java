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
	//�л��� ���� ��(DB)
	private HashMap<StudentVO , List<Integer> > smsMap = new HashMap<>();
	private String[] arSubject = {"����","����","����"};
	private StudentVO student;
	
	//�л� ������ ���� ���
	public void insert(String name, int age, List<Integer> arScore) {
	// �����ڸ� ���ؼ� �л� ����� db�� ����
		//db�� �������� ������ �ᱹ �������� ����� �л��� ����ȴ�.
		student = new StudentVO(name,age);
		smsMap.put(student, arScore);
	}
	
	//�л� ���� ����
	public String update(int num,String name, int age) {
		String result = "���� ����";
		//��ȣ�� �л� �˻� �� ���������� student�� �л� ��ü ����
		//�˻� ��� x, null�� ����
		select(num);
		
		if(student.equals(null)) {
			result = "���� ����";
			
		}else {
			student.setAge(age);
			student.setName(name);
		}
		return result;
		
	}
	
	//�л� ���� ����
	public String update(int num, List<Integer> arscore) {
		String result = "���� ����";
		select(num);
		if(student.equals(null))result = "���� ����";
		else{
//			for(int i =0; i<arscore.size();i++) {
//				
//				smsMap.get(student).set(i, arscore.get(i));
//			}
			smsMap.replace(student, arscore);
		}
		return result;
	}
	
	//�л� ���� ����
	public String delete(int num) {
			Iterator<StudentVO> iter = smsMap.keySet().iterator();
			String result ="���� ����";
			while(iter.hasNext()) {
				student = iter.next();
				if(student.getNum()==num) {
					smsMap.remove(student);
					result ="���� ����";
					break;
				}
		}	
			return result;
	}
	
	//�˻�
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
			result = "��� ����";
		}
			
		while(iter.hasNext()) {
			java.util.Map.Entry<StudentVO, List<Integer>> e = iter.next();
			
			//toString VO�ܿ��� ��������.
			result += e.getKey();
			for(int score : e.getValue()) {
				result += arSubject[index] + " : "+score +"��\n";
				index++;
			}
			index=0;
		}
		return result;
	}
	
	//����Ʈ �������̵�
	public String list(ArrayList<StudentVO> arstudent) {
		String result= "";
		int index =0;
		if(arstudent.size()==0) result = "�˻� ��� ����";
		
		for(int i=0; i<arstudent.size(); i++) {
			result += arstudent.get(i);
			for(int score : smsMap.get(arstudent.get(i))) {
				result += arSubject[index]+" : "+score+"��\n";
				index++;
			}
			index=0;
		} 
		return result;
	}
	
	public void view() {
		Scanner sc =new Scanner(System.in);
		
		do {
			System.out.println("1.�л����\n" + 
					"2.�л����\n" + 
					"3.�л��˻�\n" + 
					"4.�л�����\n" + 
					"5.�л�����\n" + 
					"6.������");
		
			int choice =0;
			choice = sc.nextInt();
			String name;
			int age,num;
			List<Integer> arScore = new ArrayList<>();

			if(choice ==6) break;
			
			switch(choice) {
			case 1:
				arScore = new ArrayList<>();
				System.out.print("�л��̸� : ");
				name = sc.next();
				System.out.print("�л����� : ");
				age = sc.nextInt();
				
				System.out.print("�л�����(����, ����, ����)");
				for(int i =0; i<arSubject.length; i++) {
					arScore.add(sc.nextInt());
				}
				
				insert(name, age, arScore);
				
				break;
				
			case 2:
				
				System.out.println(list());
				
				break;
				
			case 3:
				System.out.print("�˻��� �л��� �̸��Է� : ");
				System.out.print(select(sc.next()));
				break;
				
			case 4:
				arScore = new ArrayList<>();
				System.out.println("1.��������\n2.��������");
				choice = sc.nextInt();
				if(choice <1 || choice > 2) break;
				
				System.out.println("�л� ��ȣ �Է� : ");
				num = sc.nextInt();
				
				switch(sc.nextInt()) {
				case 1:
					System.out.println("���ο� �̸� : ");
					name = sc.next();
					System.out.println("���ο� ���� : ");
					age = sc.nextInt();
					System.out.println(update(num, name, age));
					break;
				case 2:
					System.out.println("���ο� ���� �Է�(����, ����, ����");
					for(int i=0; i<arSubject.length; i++) {
						arScore.add(sc.nextInt());
						
					}
					System.out.println(update(num, arScore));
					break;
				}
				break;
				
			case 5:
				System.out.println("�����Ͻ� �л��� ��ȣ : ");
				num = sc.nextInt();
				
				System.out.println(delete(num));
				break;
		default : 
			System.out.println("�ٽ� �õ��� �ּ���.");
		}
	}while(true);
		
		
	}
	
	
	
	
	
}
