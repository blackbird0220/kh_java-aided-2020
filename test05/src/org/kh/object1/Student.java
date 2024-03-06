package org.kh.object1;

public class Student {

	String name = "김응원";
	int kor = 100; //값 넣지 않아도 0(기본값으로 세팅됨). =(숫자) 기본값을 설정
	int eng = 100;
	int mat = 100;
	int tot() {
			return this.kor+this.eng+this.mat;
	}
	double avg() {
		return (this.kor+this.eng+this.mat) / 3.0f;
	}
	void resulting() {
		System.out.println("이름 : "+this.name+"총점 :"+this.tot()+"평균 : "+this.avg());
	}
		
		/*String name;
		int kor; //값 넣지 않아도 0(기본값으로 세팅됨). =(숫자) 기본값을 설정
		int eng;
		int mat;
		public int */
		
		/*String name = "";
		int[] score = {kor,eng,mat};*/
}	

