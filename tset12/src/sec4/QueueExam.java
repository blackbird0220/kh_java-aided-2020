package sec4;
//Queue : 선입선출법
//자바에서는 Queue가 인터페이스이므로 같은 구조를 가진 LinkedList를 이용하여 생성한다

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {
	public static void main(String[] args) {
		//Queue<String> q = new Queue<>();xxx
		Queue<String> q = new LinkedList<>();
		//큐(Queue)에 요소 추가
		q.offer("아이브");
		q.offer("뉴진스");
		q.offer("케플러");
		q.offer("에스파");
		q.offer("여자아이들");
		q.offer("르세라핑");
		
		System.out.println(q.peek()); //선입선출이라서 아이브가 출력됨/ 맨 처음 데이터 검색 반환
		System.out.println(q.peek());
		System.out.println("peek 후의 "+q);
		System.out.println("\n******************************************");
		System.out.println(q.poll()); //맨 처음 데이터 반환 후 제거
		System.out.println(q.poll());
		System.out.println("poll 후의 "+q);

	}

}
