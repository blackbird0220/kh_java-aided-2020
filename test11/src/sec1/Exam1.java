package sec1;

public class Exam1 {

	public static void main(String[] args) {
		int a = 1004;		//기본형
		int b = 1004;
		System.out.println("a==b :" +(a==b)); //단순 변수의 정수 값 비교
		String s1 = "김응원"; 
		String s2 = "김응원";
		System.out.println("s1==s2 :" +(s1==s2)); //문자열의 값 비교 /자바에서는 가능하지만 Spring에서는 이것도 equals 안쓰면 오류남
		System.out.println("s1 equals s2 :" +(s1.equals(s2))); //맞는 문자열의 값 비교. String 클래스 연산을 해야하므로반드시 equals써야함

		Integer c = new Integer(1004);	//참조형
		Integer d = new Integer(1004);  //참조형
		System.out.println("a==c :" +(a==c));	//기본형과 참조형의 비교는 값 비교
		System.out.println("d==c :" +(d==c));	//참조형과 참조형의 비교는 주소 비교
		System.out.println("c equals d :" +(c.equals(d))); //참조형의 비교는 equals
	}

}
