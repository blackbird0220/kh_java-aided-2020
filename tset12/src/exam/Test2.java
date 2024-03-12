package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//이름 목록 작성: 기보드로 이름을 입력받아 이름 목록에 추가하되,
//입력 값이 clear면 이름목록을 추가함, exit이면, 반복루프를 종료
//만약, 기존값과 중복된 이름이 있으면, "이미 존재하는 이름입니다." 메시지를 출력하고, 계속 입력모드로 진행되며 
//만약 입력 값에 대한 이름이 존재하지 않으면, 이름 목록에 이름을 추가하고 이름 목록을 출력한다.
//사람이름 입력해서 이름 리스트 만드는 것
public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> nameList = new ArrayList<String>();
		
		while(true) {
			System.out.println("추가할 이름을 입력하세요:");
			String name = sc.next();
			
			if(name.equals("clear")) {//1. String 비교는 ==이 아니고 .equals()를 써야 함
				//continue;  2.continue 구문이 실행해야 할 다른 문장보다 앞서 있어서 continue 구문 이후의 문장이 실행되지 않음
				System.out.println("이름 목록을 초기화 합니다.");
				nameList.clear();
				continue;
			}
			if(name.equals("exit")) { //1. String 비교는 ==이 아니고 .equals()를 써야 함
				System.out.println("<<입력 종료>>");
				break; //3.return;이 있으면 exit가 입력될 경우 아래 반복출력 문장을 실행지 못하고, main함수의 밖으로 탈출해버린다.
			}
			if(nameList.contains(name)) {
				System.out.println("<이미 존재하는 이름입니다>");
			}else {
				nameList.add(name); //4.이름 목록에 이름을 추가하는 구현코드가 없어서 넣어줘야 함
				System.out.println(name+"추가 완료.");
			}
		}
		for(String n: nameList) { //3
			System.out.println(n);
		}
	}
}	
