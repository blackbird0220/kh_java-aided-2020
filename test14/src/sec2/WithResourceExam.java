package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class AutoResource implements AutoCloseable{ //AutoCloseable 열린 객체를 자동으로 닫는 인터페이스

@Override
	public void close() throws Exception {
		System.out.println("리소스가 자동으로 close 되었습니다");
		
	}
}
public class WithResourceExam {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		//FileInputStream fis = null; 
		//fis = new FileInputStream("a.txt");
		//try~with~resource :열린 리소스(파일 포함)는 모두 닫힌다.
		try (AutoResource obj = new AutoResource()){
				throw new Exception();
		}catch (IOException e) {
				System.out.println("예외 부분");
			}
		}
	}

