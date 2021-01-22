package day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
	public static void main(String[] args) throws IOException{
		//FileWriter("���ϸ�");
		//�̹� ������ �����ϸ�������� �����ְ�,
		//������ �������� ������ ���Ӱ� �������ش�.
		/*
		 * Java�� �ü���� ������ �°� �ڵ����� �ٹٲ� ���ڸ� �������ش�.
		 * ��, �ٹٲ��� �ν��ϴ� ���� "\n" �� "\r\n"
		 * ��������� �ؽ�Ʈ ���Ϸκ��� �ؽ�Ʈ�� �ҷ��� �� ����Ű�� ����������
		 * ����Ϸ��� "\r\n"���� �Ѵ�.
		 */
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		
		bw.write("�ǻ�\r\n");
		bw.write("����");
		bw.newLine();
		bw.write("����\r\n");
		bw.write("��ȣ��\r\n");
		bw.write("����\r\n");
		bw.write("������\r\n");
		bw.close();
		while(true) {
			//�ٹٲ��� ����
			
			String line = br.readLine();
			if(line == null) break;
			System.out.println(line);
		}
		br.close();
	}
}
