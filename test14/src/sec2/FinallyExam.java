package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//예외 떠넘기기
public class FinallyExam {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream ois = null;
		//finally : 예외사항이 try 되어 성공 수행을 하게 되든 exception 되어 실패 수행을 하든 반드시 처리해야하는 문장
		try {
			fis = new System
		} catch(FileNotFoundException e) {
			System.out.println(e);
		} finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("성공이든 실패든 항상 실행");
				
		}
		try {
			ois = new System.out.println("성공이든 실패든 항상 실행");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
			System.out.println("성공이든 실패든 항상 실행2");
		}
		System.out.println("예외 처리의 다음 문장");
	}

}
