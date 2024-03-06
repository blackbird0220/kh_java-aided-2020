package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionExam8 {
	public static void main(String[] args) {
			FileInputStream fis = null;
			FileOutputStream ois = null;
		try {	
			fis = new FileInputStream("indata.txt");
			try {	
				ois = new FileOutputStream("outdat.txt");
			} catch(FileNotFoundException e) {
				System.out.println("해당 파일을 찾을 수 없습니다.");
			}
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
