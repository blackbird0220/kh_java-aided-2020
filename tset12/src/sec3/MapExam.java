package sec3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
//map: HashMap, Hashtable, Properties,TreeMap
//=>키와 값 분리시에는  entry 또는 element단위로		Iterator나 Enumeration을 필요로함
public class MapExam {

	public static void main(String[] args) {
		//Map은 List와 달리 인덱스가 없어서 순서유지가 안되고 키가 존재한다./for구문 못씀
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, String> map2 = new Hashtable<>(); //얘는 왜 소문자?
		Map<Integer, String> map3 = new TreeMap<>();
		Properties map4 =new Properties(); 
		//Properties는 키(필드이름)와 값은 모두 문자열로 취급한다. Integer규정이 안됨 String 만 가능
		//게임에서 많이 쓰임, 속성을 보관하기 쉬음 
		map1.put("kim", 90);	//추가
		map1.put("lee", 100);
		map1.put("park", 95);
		map1.put("choi", 88);
		map1.put("kang", 88);
		System.out.println(map1);
		System.out.println("park :"+map1.get("park"));	//개별요소 접근시 인데스가 아니라 키로 접근해야 한다

		
		System.out.println("\n");
		
		
		//맴 순화1:Iterator(분리자, 독립자)에 의한 접근
		//keys = {kim lee park choi kang}
		Iterator<String> keys = map1.keySet().iterator();//앱의 키모음의 하나의 요소로 분리됨
		while(keys.hasNext()) {
			String key = keys.next();
			//System.out.println(map1.get(key)); 방법1	//map1.get("kim")
			System.out.println(key+"="+map1.get(key)); //방법2
		}
		//map 순회2 : entrySet(키와 값의 쌍)에 의한 접근 ex)("kim", 90),("lee", 100)
		/*for(Map.entry(String, Integer> en : map1.entrySet()){
			String key = entry.getValue();
			System.out.println(key+" : "+map1.getkey());
		}*/
		
		System.out.println("\n");
		
		
		if(map1.containsKey("kang")) {
			System.out.println("kang : "+map1.get("kang"));
		} else {
			System.out.println("키가 kang인 요소가 존재하지 않습니다");
		}

		if(map1.containsValue(100)) {
			System.out.println("100점 만점자가 존재합니다");
		} else {
			System.out.println("100점 만점자가 존재하지 않습니다");
		}

		map2.put("김", "1코스");
		map2.put("이", "2코스");
		map2.put("박", "3코스");

		map2.put("김", "2코스"); //key는 중복될 수 없음
		map2.put("이", "4코스");

		System.out.println(map2); //김이 1코스였다가 2코스로 바뀜, 이도 2코스였다가 4코스로 바뀜/ {}map의 출력기호
		map2.remove("김");
		System.out.println("********편집 후*******");
		
		System.out.println(map2);
		System.out.println("********비우기 후*******");
		map2.clear();
		System.out.println(map2);

		System.out.println("\n");
		
		String[] names = {"김응원","김동준","최예실","이다현","권다이","윤세정","김필규","김윤정","남희석","김예은"};
		for(int i=0;i<=9;i++) {
			map3.put(i, names[i]);
		}
		System.out.println("인원수 :"+map3.size());
		for(Integer i : map3.keySet()) {
			int key = i;
			String value = map3.get(i);
			System.out.println(key + ":" +value);
		}
		
		
		System.out.println("\n");
		
		
		
		//String[] arr = new String[10];
		//arr = map2.values();
		//map2. 
	
		map4.setProperty("name", "김응원");
		map4.setProperty("age", "43");
		map4.setProperty("height", "165");
		map4.setProperty("kor", "100");
		map4.setProperty("eng", "85");
		map4.setProperty("mat", "95");
		System.out.println("이름:"+map4.getProperty("name"));
	}
}
