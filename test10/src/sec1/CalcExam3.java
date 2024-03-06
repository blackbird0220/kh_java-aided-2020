package sec1;

public class CalcExam3 {

	public static void main(String[] args) {
		Repeator rep1;
		//rep1= new Calcurator(); 
		//안됨 자식클래스에서 부모생성자 생성할 수 없음
		
		//rep1 = new Repeater;	
		//추상클래스이기 때문에 내부에 추상 메소드가 존재하고 있어(abstract~)
		//구현한 내용이 없으므로 생성할 수 없음
								
		rep1 = new Arithmatic();
		
		int num1 = 7;
		int num2 = 0;
		//rep1은 Repeater로 선언되어 있으므로 Repeater에는 print)()에 선언되어 있지 않아 사용불가
		//rep1.print();
		
		
		System.out.println("원주율:"+rep1.PI);
		System.out.println("덧셈:"+rep1.add(num1, num2));
		System.out.println("뺄셈:"+rep1.subtract(num1, num2));
		System.out.println("곱셈:"+rep1.multiply(num1, num2));
		System.out.println("나눗셈:"+rep1.divide(num1, num2));
		System.out.println("거듭제곱:"+rep1.power(num1, num2));
	}

}
