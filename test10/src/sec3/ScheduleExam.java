package sec3;

public class ScheduleExam {
	public static void main(String[] args)
		Scheduler s =null;
		System.out.print("전화 상담 방식 선택[A-Z]:");
		int ch = System.in.read(); //문자 입력시 해당 문자의 아스키 코드 숫자로 형변환하여 입력됨
		
		//키보드로 알파벳[A~Z]를 입력받아 입력 값이 'R'이면, RoundRobin의 객체가
		//'P'이면, PriorityAllocationdml 객체가
		//'L'이면, LeastJob 의 객체가 생성되고,
		//그 밖의 문자가 입력되면, "지원하지 않는 스케줄링입니다."를 출력
		//입력문자는 대문자와 소문자 모두 입력가능하도록 비교하여야 함
		//if, switch 구문 사용하기
		/*
		switch(ch) {
			case 'R';
			case 'r';
				s = new RoundRobin();
				break;
			case 'P';
			case 'p';
				s = new PriorityAllcation();
				break;
			case 'L';
			case 'l';
				s = new LeastJob();
				break;
			default:
				System.out.println("지원하지 않는 스케줄링입니다.");*/
		
		if(ch=='P' || ch =='p') {
			s = new PriorityAllocation();
			
				
		s.getNextCall();
		
		s.sendCallToAgent();
	}
}
