package sec3;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		//TreeMap 선언 및 객체 생성
		Map<Integer, String> map0 = new TreeMap();
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		TreeMap<Integer, String> map2 = new TreeMap<>();
		TreeMap<Integer, String> map3 = new TreeMap<>(map1);
		TreeMap<Integer, String> map4 = new TreeMap<>() {{
			put(1, "김응원");
		}};

		
		map2.put(1, "김응원"); 	//요소(entry) 추가
		map2.put(2, "박성은");
		map2.put(2, "조대신");
		map2.put(2, "이희훈");
		map2.put(2, "이자영");

		//키가 4인 요소를 제거
		
		map2.remove(1, "김응원"); 
		System.out.println(map0);
		
		//TreeMap 비우기
		map2.clear();
		
		
		//TreeMap 순회하여 출력
		for(Integer i: map2.keySet()) {
			System.out.println(i+":"+map2.get(i));
		}
		
		System.out.println("map2 :"+map2);
		System.out.println("map2에서 키가 5인요소 :"+map2.get(5));
		System.out.println("map2에서 가장 첫 엔트리 :"+map2.firstEntry());
		System.out.println("map2에서 가장 첫 키 :"+map2.firstKey());
		
		
		
	}

}
