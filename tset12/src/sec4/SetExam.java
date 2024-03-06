package sec4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//Set: 값만 저장, 중복 허용하지 않음, 순서 유지하지 않음
//Set 종류 : HashSet, TreeSet 
public class SetExam {
	public static void main(String[] args) {
		//Set의 선언 및 생성
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new TreeSet<Integer>();
		
		set1.add("김응원");
		set1.add("이정희");
		set1.add("이예린");
		set1.add("이종우");
		set1.add("이연정");
		set1.add("김응원");
		set1.add("이성하");
		set1.add("이민규");
		set1.add("이원석");
		
		System.out.println("set1 요소의 수 : "+set1.size()); //9개를 추가하였으나 중복된 값 때문에 8개로 출력
		//중복 허용 안함
		System.out.println(set1); // [ ] 대괄호로 출력됨

		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = sc.next();
		
		if(set1.contains(name)) {
			System.out.println("해당 이름이 존재합니다.");
		} else {
			set1.add(name);
			System.out.println("\n"+name+"이 입력되었습니다");
		}
		
		
		//set1 특정 요소 삭제
		set1.remove("김응원");
		
		//set1 비우기
		set1.clear();
		
		
		
		
		
		
		if(set2.isEmpty()) {
			System.out.println("set2가 비어있습니다.");
		} else {
			System.out.println("set2요소의 수 : "+set2.size());
		}
		
		Set<Integer> set3 = new TreeSet<Integer>(Arrays.asList(9,3,4,6,8,7,6));
		System.out.println(set3); 
	
		//Set의 순회1-> 향상된 for문
		for(Integer s:set3) {
			System.out.print(s+"\t");
		}
		//Set의 순회2 ->Iterator에 의한 순회
		Iterator it = set3.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"\t");
		}
		
	}

}
