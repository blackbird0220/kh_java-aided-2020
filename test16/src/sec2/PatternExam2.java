package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExam2 {

	public static void main(String[] args) {
		String[] no = {"","","",""};//+$는 더이상 추가할 조건이 없다는 의미
		Pattern p1 = Pattern.compile("");	//이메일 패턴
		
		for(int i=0;i<email.length;i++) {
			Matcher m = p1.matcher(email[i]);
			if(m.matches()) {
				System.out.println("이메일 형식이 맞습니다.");
				System.out.println(email[i]);
			}
		}
		String[] phone = {"02-864-7036","010-8891-6742","031-654-4677","1800-3535","010-424246-35462347"};
		Pattern p2 = Pattern.compile("010-\\d{6}-\\d{8}");//핸드폰 번호 패턴

		for(int i=0;i<phone.length;i++) {
			Matcher m = p2.matcher(phone[i]);
			if(m.matches()) {
				System.out.println("휴대폰 번호 형식이 맞습니다.");//010-424246-35462347 출력됨
			}
		
		}

		String[] noo = {"8756565656565","670315-2468379","111000-5897897","881465-4869257"};
		Pattern p3 = Pattern.compile("\\d{6}\\-[1-4]\\d{6}");	//주민번호 패턴
		for(int i=0;i<noo.length;i++) { 
			Matcher m = p3.matcher(noo[i]);
			if(m.matches()) {
				System.out.println("주민등록번호 형식이 맞습니다.");
				System.out.println(noo[i]);
			}
		}	

		String[] postno = {"452-99","1-547","3624724","900-34"};
		Pattern p4 = Pattern.compile("\\d{3}[1]-");	
		//우편번호 패턴 100번대(1xx-yy)~700번대(7xx-yy)
		for(int i=0;i<postno.length;i++) {
			Matcher m = p4.matcher(postno[i]);
			if(m.matches()) {
				System.out.println("우편번호 형식이 맞습니다.");
				System.out.println(postno[i]);
	//비밀번호 패턴 : 4~10글자로 영문 대/소문자와 특수문자(!@#$%^&*) 그리고 숫자를 모두 최소1문자를 포함
	//()반드시 포함
	//=. 이상  
	//*뒤에 나오는 조건으로  
				String[] postno = {"452-99","1-547","3624724","900-34"};
				Pattern p4 = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?_]).{4,10}$");	
				//우편번호 패턴 100번대(1xx-yy)~700번대(7xx-yy)
				for(int i=0;i<postno.length;i++) {
					Matcher m = p4.matcher(postno[i]);
					if(m.matches()) {
						System.out.println("우편번호 형식이 맞습니다.");
						System.out.println(postno[i]);
			}
		}
	}
}	