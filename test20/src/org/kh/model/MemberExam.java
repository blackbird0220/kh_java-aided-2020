package org.kh.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import section.Member;

public class MemberExam {
	Scanner sc = new Scanner(System.in);
	List<Member> memList = new ArrayList<>();
	public static void main(String[] args) {
		boolean sw= true;
		MemberExam app = new MemberExam();
		app.mainCall();
	}
	//메뉴를 반복 호출하고, 키보드에서 각 해당 번호를 누르면 각 직업이 이루어 질 수 있도록 하시오
	public void mainCall() { //1. 회원 가입, 2. 회원 목록, 3. 회원삭제, 4. 프로그램 종료
		while(sw) {
			System.out.println("1. 회원가입, 2. 회원목록, 3. 회원삭제, 4. 프로그램종료");
			System.out.println("작업번호");
			int job = sc.nextInt();
			memList.add(new Member(mcode, id, pw, name, year, tel));
			
			
			
				
			
				/*case 1. 
					add();
					break;
				case 2. 
					info();
					break;
				case 3. 
					remove();
				case 4
				 	sw= false
				 	break;
				default*/
				
					
			}
		}
	public void add() {
		System.out.println("레벨 입력: ");
		int mcode = sc.nextInt();
		System.out.println("아이디 입력: ");
		String id = sc.next();
		System.out.println("비밀번호 입력: ");
		String pw = sc.next();
		System.out.println("이름 입력: ");
		String name = sc.next();
		System.out.println("출생연도 입력: ");
		int year = sc.nextInt();
		System.out.println("전화번호 입력: ");
		String tel = sc.next();
		memList.add(new Member(mcode, id, pw, name, year, tel));
		System.out.println("새로운 회원등록을 완료하였습니다");
		}
		
	public void info() {
		for(Member s:memList) {
			System.out.println(s.toString());
		}
		
	public void remove() {
		System.out.println("제거할 회원 ID 입력: ");
		String id = sc.next();
		for(int i = 0 ; i<memList.size(); i++);
			if(memList.get(i).getId().equal(id)) {
				System.out.println("제거: "+memList.get(i).toString());
				memList.remove(i);
			}
		}
	}
}		//int mcode, String id, String pw, String name, int year, String tel
		
		
		
		
		
		
		
		

	}
}
