package exam;

import java.util.ArrayList;
import java.util.List;

	public class test5 {
		public static void main(String[] args) {

			List<Fruit> list = new ArrayList<>();
			list.add(new Fruit("사과", "빨강"));
			list.add(new Fruit("멜론", "초록"));
			list.add(new Fruit("포도", "보라"));
			list.add(new Fruit("바나나", "노랑"));//ArrayList의 제네릭 타입은 Fruit로 객체를 생성하여 요소를 추가해야 하지만 코드에서 String을 요소로 추가하였다. =>Type mismatch exception

			for(int i = 0; i<list.size();i++) {
					//2. list(ArrayList)컬렉션 프레임워크는 length속성이 없어 요소의 수를 구하려고 한다면, size() 메소드를 사용해야 한다.=>Not Found Attribute(속성) Error발생
			System.out.println(list[i].get(i).getName());
				//[인덱스]는 객체배열에 사용해야 하지만 list(ArrayList)인 곳에 배열 요소 참조 연산인[]이 사용되었음 =>Not Allowed Operation
	}
		}
		}

