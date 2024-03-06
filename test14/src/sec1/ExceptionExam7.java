package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExam7 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileInputStream ois = null;
	try {	
		fis = new FileInputStream("indata.txt");
	} catch(FileNotFoundException e) {
		System.out.println("해당 파일을 찾을 수 없습니다.");
	} catch(Exception e) {	
		System.out.println("원인불명");
		e.printStackTrace();
	} finally {
		System.out.println("파일처리 종료");
	}
	}
}
