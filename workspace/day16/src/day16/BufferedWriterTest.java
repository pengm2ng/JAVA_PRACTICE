package day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
	public static void main(String[] args) throws IOException{
		//FileWriter("파일명");
		//이미 파이이 존재하면그파일을 열어주고,
		//파일이 존재하지 않으면 새롭게 생성해준다.
		/*
		 * Java는 운영체제의 종류에 맞게 자동으로 줄바꿈 문자를 변경해준다.
		 * 즉, 줄바꿈을 인식하는 문자 "\n" 과 "\r\n"
		 * 윈도우즈에서 텍스트 파일로부터 텍스트를 불러올 때 엔터키를 구분점으로
		 * 사용하려면 "\r\n"으로 한다.
		 */
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		
		bw.write("의사\r\n");
		bw.write("강사");
		bw.newLine();
		bw.write("가수\r\n");
		bw.write("변호사\r\n");
		bw.write("군인\r\n");
		bw.write("선생님\r\n");
		bw.close();
		while(true) {
			//줄바꿈은 제외
			
			String line = br.readLine();
			if(line == null) break;
			System.out.println(line);
		}
		br.close();
	}
}
