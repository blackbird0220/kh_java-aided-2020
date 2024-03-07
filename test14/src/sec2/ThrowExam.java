package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//예외 떠넘기기
public class ThrowExam {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null; 
		//.현재 디렉토리 ..상위디렉토리
		String  absolutePath = "d:\\kew\\java202003\\test14\\bin\\sec2\\a.txt";//절대경로
		String  relativePath1 = "a.txt";//상대경로 ->현재 디렉토리	//.현재 디렉토리 ..상위디렉토리
		String  relativePath2 = "../a.txt";//상대경로 ->상위 디렉토리
		String  relativePath3 ="../../a.txt"; //상대경로 -> test14 디렉토리 안에
		//fis = new FileInputStream("d:\\kew\\java202003\\test14\\bin\\sec2\\a.txt");
		//절대경로

		fis = new FileInputStream(absolutePath);
		if(fis!=null) {
			fis.close();
		}
	}

}
