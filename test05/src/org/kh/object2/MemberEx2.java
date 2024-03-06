package org.kh.object2;

import org.kh.object1.Member;

public class MemberEx2 {

	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setId("kim");
		mem1.setPw("1234");
		mem1.setEmail("kewchb@naver.com");
		mem1.setBirth("1981");
		mem1.setTel("01045648598");
		System.out.println("id : "+mem1.getId());
		System.out.println(mem1.toString());
	}

}

