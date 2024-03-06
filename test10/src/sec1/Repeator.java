package sec1;

public abstract class Repeator implements Calcurator{
     //인터페이스로부터 상속받은 추상클래스는 전부 또는 일부만 추상화 할 수 있으며
	//물려받은 메소드에 대하여 원하는메소드만 구현이 가능
	//별도의 추상 메소드도 정의할 수 있음
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	abstract int power(int num1, int num2);//개별 추상화
}
	
// 두개가 다 추상체여서 오버라이드 안나옴/abstract 
/*

	@Override
	int power(int num1, int num2){ //num1의 num2 승 구하기
		
		
		int add(int num1, int num2);	//두 수의 덧셈구현
		int subtract(int num1, int num2);	//두 수의 뺄셈구현
	}
*/	
