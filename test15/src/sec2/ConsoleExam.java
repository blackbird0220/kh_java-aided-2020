package sec2;

import java.io.Console;

public class ConsoleExam {

	public static void main(String[] args) {
		Console con = System.console(); 
		//Console 보다 Scanner를 더 많이 사용할 수밖에 없다. Console은 대기가 없음

		System.out.println("이름: ");
		String name = con.readLine();
		
		System.out.println("점수 :");
		int point = Integer.parseInt(con.readLine());
				
		System.out.println("체중: ");
		double weight = Double.parseDouble(con.readLine());
		
		System.out.println("비밀번호 :");
		char[] pwc = con.readPassword();
		String pw = new String(pwc);//문자배열을 문자열로 형 변환
		
		Person p = new Person(name, point, weight);
		System.out.println(p.toString()+", password="+pw);
	}

}
