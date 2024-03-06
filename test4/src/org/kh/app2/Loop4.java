package org.kh.app2;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		/*
		 for(초기식;조건식;증감식)과 마찬가지로 조건이 만족하는 동안만 반복수행
		 그러나 while의 괄호에 조건만 기입하고, 해당 블록 안에 증감식이 기재되며
		 초기식을 while 시작
		 while(조건식) {
		 	  반복할문장;
		 } 무한루프
		  */ 
		int i=0, tot = 0;	 
		while(i<5) {		//
			i++;
			tot+=i;
		}
		System.out.println("결과 : "+tot);
		//해당 숫자를 입력하면, 구구단 중 해당 숫자의 단을 출력하시오.구구단 만들기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력[2-9] : ");
		int n = sc.nextInt();
		int j = 0;	  //초기식
		while(j<9) {  //조건식   방법1
			j++;	  //증감식
			System.out.println(n+" * "+j+" = "+(n*j));
		}
		for(n=)
	}

}
