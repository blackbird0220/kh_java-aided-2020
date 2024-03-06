package sec2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		List<Student> sList = new LinkedList<>();
		
		Student s1 = new Student(); //1번 방법
		s1.setNo(1);
		s1.setName("강민우");
		sList.add(s1);
		
		Student s2 = new Student(2,"강범준", 100); //2번 방법
		sList.add(s2);
		
		sList.add(new Student(3,"이범준", 90)); //3번 방법  구현하는 여러가지 방법이 있음
		
		System.out.println("Number\tName\tpoint");
		for(Student s:sList) {
		System.out.println(s.getNo()+"\t"+s.getName()+"\t"+ s.getPoint());
		}
		//ArrayList는 내용이 없는 인스턴스의 메모리가 그대로 차지되고 있으나 (내용만 지워짐, 메모리는 확보)
		//Vector는 내용이 없으면, 메모리에서 제거됨(메모리 용량자체를 없애버림
	
	}
}
