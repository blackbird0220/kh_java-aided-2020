package sec2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		List<Member> memList = new ArrayList<Member>();
		List<Member> memList2 = new ArrayList<Member>();
		//Member(int mno, String mname, int age, String email, int point)
		for(int i=1; i<10; i++) {
			Member mem = new Member(i, "kim"+i, i+i, "김"+i, 0);
			memList.add(mem);	
		}
		Member mem2 = new Member(11, "kim20", 202, "김20", 0);
		memList.add(mem2);
		
		for(Member m:memList) { //List 순회1
			System.out.println(m.toString());
		}
		
		memList.remove(3); //인덱스가 3인 Member 인스턴스가 제거
		
		Member tmp = new Member(11, "kim20", 202, "김20", 0);
		System.out.println(memList.contains(mem2));
		
		for(int i=0; i<memList.size();i++) { //List 순회2번째 방법
			Member m = memList.get(i);
			System.out.println(m.toString());	
		}
		if(memList2.isEmpty()) {
			System.out.println("비어있는 리스트입니다.");
		}else {
			System.out.println("내용이 있는 리스트입니다.");
		}
		
		List<String> names = new ArrayList<>();
		names.add("김민구");
		names.add("김민규");
		names.add("이서아");
		names.add("이종우");
		names.add("이희훈");
		names.add("김연정");
		
		if(names.contains("이연정")) {
			System.out.println("이연정 데이터가 존재합니다.");
		} else {
			System.out.println("이연정 데이터가 존재하지 않습니다.");
			names.add("이연정");
		}
			
		for(String s:names) {
			System.out.println(s);
		}
		
		names.clear();		//이름이 있는지 없는지 null값을 확인한 다음에 값을 넣어주는 코딩을 해야 한다.
		if(names.isEmpty()) {
			System.out.println("리스트가 비어있습니다.");
		}else {
			for(String s:names) {
				System.out.println(s);
			}
		}
		//많이 쓰는 메소드: add, remove, contains, inEmpty, size, get
	}
}

//int mno, String mname, int age, String email, int point