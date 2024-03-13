package exam;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();//Integer는 안써도 상관없음
		//1. list 선언만 있으므로  객체생성이 되어있지 않아 nullpointerExcetion이 발생한다
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
		list.add(1);//정수로 바꿔야 함
		//2.List의 선언시 요소의 데이터 타입이 Integer로 설정되어 있으므로 정수만 입력 받을 수 있다.
		//실수값을 넣으면 오류
		
		for(int num: list) {
			char ch;
			
			if(num<0) {	
				//3. 알고리즘 오류: 조건식을 잘못 씀. if문의 조건에서 0을 포함하여 음수라고 표현했으므로 
				// 0이어도 음수가 발생하고 num값이 0일때의 정상적인 else구문 처리가 불가능하다 
				ch = '-';				
			} else if(num >0) {
				ch = '+';
			} else {
				System.out.println("@@@@@@@@@");
				continue;
			}
			for(int i=1;i<=Math.abs(num); i++) {//abs: 정수를 대입하면 그 수에 대한 절대값만 산출됨
				//해당 숫자의 횟수만큼 부호를 출력해야 되는데 한 번씩 덜 출력
				//for 반복문의 실행조건이 해당 숫자를 포함하는 것이 아닌 작을 때까지만 실행하게 되어 해당 숫자의 횟수만큼 부호를 출력해야 되는데 못함
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
