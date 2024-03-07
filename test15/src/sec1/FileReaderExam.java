package sec1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExam {
//FileReader BufferedReader : 문자열 단위로 읽기때문에 한글 안깨짐 
	public static void main(String[] args) throws IOException{
		File file = new File("a.txt");//내용은 집어넣을 수 없음.
		if(file.exists()) {	
			FileReader fr = new FileReader(file);
			
			while(fr.read()>0) {
				System.out.println((char) fr.read());
			}
		}
	}
}
