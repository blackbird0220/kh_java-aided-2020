package sec3;
//스케줄링: 선점형과 비선점형이 있다.
//선점preenption: 해당 프로세스가 처리되다가 다른 프로세스에 cpu를 양도될 수 있는 스케줄링
//비선점 nonpreenption: 해당 프로세스가 모두 완료될 떄까지 다른 프로세스에게 cpu를 양도될 수 없는 스케줄링
	중간에 작업자가 바뀔 수 없다
프로세스 스레드(자바)
//5개의 프로세스명이 1시간씩 교대로 시스템을 사용
//아래와 같이 5개의 프로세스가 CPU에서 처리되고자 한다면
//A	3시간 08:00
//B	2시간 09:00
//C	4시간 10:00
//D	3시간 14:00
//E 2시간 14:00
//선착순으로 ABCDE의 프로세스가 있다
//우성, 선착순으로 1시간씩 배분하여 일정계획을 세우자
//돌아가면서 특정 시간만큼 처리되다가 대기큐에서 대기하였다가 해당 순서가 오면 처리되는 방식
// A(2) -> B(1)-> C(3)-> D(2)-> E(1)-> A(1)->B(0)-> C(2)-> D(1)-> E(0)->
B E A D C
//LeastJob 요구 시간이 가장 작은 곳부터 실행

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("현재 상담이 모두 완료되어 다음 상담하실 분 들어오세요.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담시간이 가장 적게 걸리는 사람을 우선 배정합니다.");
		
	}

}
//하나의 여려 명이 사용하기 위하 시스템 사용 계획표