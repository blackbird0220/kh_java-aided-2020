package sec1;
//정적 내부 클래스인 Inner 클래스는 외부든 내부든 정적요소만 허용
class Outer2 {
	private int num = 10;
	private static int sNum = 20;
	
	static class Inner { 	//정적 내부 클래스
		int inNum = 1000;
		static int sInNum = 2000;

		void inMethod() {
			System.out.println("내부에서 내부 클래스의 인스턴스 변수 : inNum ="+inNum);
			System.out.println("내부 클래스의 정적 멤버 변수 : sInNum = "+sInNum);
			//System.out.println("내부에서 외부 클래스의 인스턴스 변수 : num ="+num);
			System.out.println("내부에서 외부 클래스의 정적 멤버 변수 : sNum ="+sNum);
		}	
	}
	static void outMethod() {	//외부클래스의 정적 메소드
		System.out.println("외부에서 내부 클래스의 인스턴스 변수 : inNum ="+inNum);
		System.out.println("외부에서 내부 클래스의 정적 멤버 변수 : sInNum = "+sInNum);
		//System.out.println("외부에서 외부 클래스의 인스턴스 변수 : num ="+num);
		System.out.println("외부에서 외부 클래스의 정적 멤버 변수 : sNum ="+sNum);
	}
}
public class StaticInnerClassExam {
	public static void main(String[] args) {
		Outer2 out = new Outer2();	//외부 클래스의 인스턴스
		Outer2.Inner inner = new Outer2.Inner();	//내부 클래스의 인스턴스
		Outer2.Inner inner = new Outer2.Inner();
		//out.outMethod();// outMethod는 정적 메소드이므로 객체를 생성하지 않고 실행
		
	}

}
