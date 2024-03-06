package sec3;

public class ScopeExam {
	int a = 10; 	// 전역 변수: 클래스 전체에서 인지되는 변수이지만, 특정 메소드(함수) 내에서는 인지하지 못한다
	static int b = 100;	// 클래스 변수: 클래스 전체에서 인지되며, 특정 메소드에서도 인지할 수있다 / Global Scope
	public static void main(String[] args) {
		int a = 20;		//지역 변수 -특정 메소드 (함수) 내에서만 사용가능하고 함수 블록을 벗어나면 인지되지 못함
		System.out.println("지역변수 a="+a);
		run();
		run(30);
	}
	public static void run () {
		// System.out.println("전역 변수 a="+a); 오류남
		System.out.println("b="+b);
	}
	
	public static void run (int a) {	//매개변수: 메소드 함수 정의시 괄호안에 있는 변수 호출시 지정된 값을 저장한다. Local Scope
		System.out.println("매개변수 a="+a);
	}
}
