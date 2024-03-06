package sec3;

import java.util.HashMap;
import java.util.Map;

public class HasgMapExam {

	public static void main(String[] args) {

		//선언 방법
		Map<String, String> map0 = new HashMap<String, String>();	//Map 인터페이스를 활용한 HashMap생성
		HashMap<String, String> map1 = new HashMap<String, String>(); //HashMap 선언 및 생성 표준식
		HashMap<String, String> map2 = new HashMap<>();//String 생략가능. 생성자에 앞서 선언한 인자의 생략이 가능
		HashMap<String, String> map3 = new HashMap<>(map1);//맵의 복제
		//배열시 개수 지정 -> String[] arr =new String[10];	//맵의 초기 용량은 기본적으로 16개
		HashMap<String, String> map4 = new HashMap<>(10);//초기 용량 지정보다 더 많은 데이터를 저장하게 되면 자동적으로 초기 용량의 두배로 증가
		HashMap<String, String> map5 = new HashMap<>(10,0.7f);//load factor - 사용 확률 지정
		HashMap<String, String> map6 = new HashMap<>() {{	//기본 key의 해당하는 값을 적용하여 HashMap 결정
			put("name","김기태");
		}};
		HashMap<Integer, String> fruits = new HashMap<>();
		fruits.put(1, "사과");	//요소 추가 <entry>
		fruits.put(2, "딸기");
		fruits.put(3, "샤인머스켓");
		fruits.put(4, "망고");
		fruits.put(5, "납작복숭아");
		fruits.put(6, "키위");
		fruits.put(7, "바나나");
		
		System.out.println(fruits);
		
		System.out.println("*********변경전**********");
		fruits.remove(3);
		
		System.out.println(fruits);

		System.out.println("*********변경후**********");
		fruits.clear();	//HashMap의 비우기
		for(Integer i :fruits.keySet()) {
			System.out.println(i+":"+fruits.get(i));
		}
		System.out.println(fruits);

		if(fruits.containsValue("샤인머스켓")) {
			System.out.println("해당 HashMap에 샤인머스켓이 존재합니다.");
		}else {
			System.out.println("해당 HashMap에 샤인머스켓이 존재하지 않습니다.");
			fruits.put(8, "샤인머스켓");
		}
		System.out.println(fruits);
	
	}
}

