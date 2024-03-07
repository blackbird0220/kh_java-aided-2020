package sec2;

import java.io.IOException;
//키보드 한글자 입려받아 출력
public class SystemInExam {

	public static void main(String[] args) throws IOException {
		System.out.println("영문단어 또는 문장을 입력하고,[Enter]를 누르세요");
		int i;
		String data;
		try {
			while(i=System.in.read() !='\n') {
			System.out.println((char) i);
			data +=-(char) i;
			//i = System.in.read(); //아스키코드 한 글자 입력 => 바이트 단위 입력
			//System.out.println(i);
			//System.out.println("입력된 문자 :"+((char)i));
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("입력된 단어 또는 문장"+data);
	}

}
