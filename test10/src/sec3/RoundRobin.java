package sec3;
//시분할 처리 시스템(Time sharing system): 하나의 시스템을 여려명(프로세서)이 사용하기위해 서로 시간대를 나누어서 처리

선점preenption
비선점 nonpreenption//하나의 여려 명이 사용하기 위하 시스템 사용 계획표
//5개의 프로세스명이 1시간씩 교대로 시스템을 사용

//선착순으로 ABCDE의 프로세스가 있다
//우성, 선착순으로 1시간씩 배분하여 일정계획을 세우자
//돌아가면서 특정 시간만큼 처리되다가 대기큐에서 대기하였다가 해당 순서가 오면 처리되는 방식
// A(2) -> B(1)-> C(3)-> D(2)-> E(1)-> A(1)->B(0)-> C(2)-> D(1)-> E(0)->
B E A D C
public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("10분으로 나누어 상담을 하고 해당순번이 되어 대기술에서 들어옵니다");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서가 누구인지 호명합니다.");
		
	}

}
