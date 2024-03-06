package org.kh.java;

public class Variable6 {

	public static void main(String[] args) {
		float f1 = 3.14f;
		double f2 = 3.14d;
		int kor=90, eng=80, mat=90;//몰아서 할 수 있음
		float avg = (float)(kor + eng + mat) / 3f;
		//float avg = (kor + eng + mat) / 3.0f; 라고 f를 붙여주면 86.67이 됨
		//float avg = (kor + eng + mat) / 3;이라고만 하면 86.666어야 하는데 float이 정수 명령어이기 때문에 86만 도출 
		System.out.printf("\nf1=%.3f", f1);
		System.out.printf("\nf2=%.2f", f2);
		System.out.printf("평균 : %.2f", avg);
	}

}
