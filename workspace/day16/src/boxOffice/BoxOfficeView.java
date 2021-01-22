package boxOffice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BoxOfficeView {

	public static String getContent() {
		return content;
	}



	public static void setContent(String content) {
		BoxOfficeView.content = content;
	}



	private static String content;
	
	
	
	public static void main(String[] args) throws IOException{
	
		content = new String(Files.readAllBytes(Paths.get("test.txt")),"EUC-KR");
		new BoxOffice();
		
		
	}
	
}
