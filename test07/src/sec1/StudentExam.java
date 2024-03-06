package sec1;

import java.util.Scanner;

public class StudentExam {

	public static void main(String[] args) {
			//Student s1 = new Student();
			//s1.print();
		Student[] s = new Student[5];
		Scanner scn = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			s[i]=new Student();
			s[i].setNo(i+1);	//번호부여
			System.out.println((i+1)+"번째 국어 : ");
			s[i].setKor(scn.nextInt());
			System.out.println((i+1)+"번째 영어 : ");
			s[i].setEng(scn.nextInt());
			System.out.println((i+1)+"번째 수학 : ");
			s[i].setMat(scn.nextInt());
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점\t");
		for(int i=0;i<5;i++) {
			s[i].print();	
		}
	}

}
