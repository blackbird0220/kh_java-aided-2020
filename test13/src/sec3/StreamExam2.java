package sec3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//String 타입의 List Stream 방식 활용
//stream 메소드();
public class StreamExam2 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("김응원");
		lst.add("이연정");
		lst.add("조우진");
		lst.add("박은성");
		lst.add("강민우");
		lst.add("장인범");
		//ArrayList의 Stream화
		Stream<String> stream =lst.stream();
		System.out.println("정렬 전");
		stream.forEach(s -> System.out.print(s+"\t"));
		System.out.println("정렬 후");
		lst.stream().sorted().forEach(s -> System.out.print("정렬 후 :"+s+"\t"));//sorted 정렬
		//요소 수 계산하여 출력
		int cnt = (int) lst.parallelStream().count();
		System.out.println("인원수 :"+cnt);
	}

}
