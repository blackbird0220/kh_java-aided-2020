package exam;

public class test4 {
	public static void main(String[] args) {
			
		//Person[] pArr = null;
		Person[] pArr = new Person[3];
		
		pArr[0] = new Person(43, "kim");
		pArr[1] = new Person(35, "kang");
		pArr[2] = new Person(43, "kim");
			//비어있거나 초기화되어 있지않은 pArr 배열에 Person 객체를 생성하여 각 요소에 생성된 객체를 대입
		for(int i=0; i <pArr.length; i++) {
				//=을 넣으면 배열의 갯수보다 연산 횟수가 많아지므로 
				// 실제 선언한 배열의 개수보다 더많은 수의 반복 실행이 된다.
				//요청한 횟수가 배열수보다 더크다=> ArrayIndexOutOfBoundException 발생				
			System.out.println(pArr[i].getName());
				//Person의 배열요소인 pArr객체가 초기화 값이 대입되어 있지 않음=>NullPointException이 발생
		}
	}
}
