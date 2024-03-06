package org.kh.app2;

//반복문 : for(), while, do~whlie~
public class Loop1 {

	public static void main(String[] args) {
		int n = 0;
		/* 반복되는 문장 10개를 수행해야 할 때
		n = n + 1;
		n = n + 1;
		n = n + 1;
		n = n + 1;
		n = n + 1;
		n = n + 1;
		n = n + 1;
		n = n + 1;
		n = n + 1;
		n = n + 1; */
		/* 게시판 글목록을 만들 때 번호제목날짜 양식 반복
		 조건식이 참일때 동안만 반복수행한다.
		 for (초기식; 조건식;증감식){ 반복해야할문장} 
		 */
		for(int i=0;i<10;i++) { //0 1 2 3 4 5 6 7 8 9 10
			n = n + 1;			//1 2 3 4 5 6 7 8 9 10
		}
		System.out.println("n="+n);
		int[] nums = {80,95,75,60,100,65,70,90,85,95};//배열,  쉼표는 붙여도 띄어도 상관없음
		String names[] = {"김", "이","박","최","정","오","배","강","장","계"};
		for (int i=0;i<10;i++)	{
			System.out.print("이름 : "+names[i]+", ");
			System.out.print("점수 : "+nums[i]+"\n");
		}
		System.out.println("n="+n);
		int[] nums2 = {80,95,75,60,100,65,70,90,85,95};
		String names2[] = {"김", "이","박","최","정","오","배","강","장","계"};
		int tot = 0;
		System.out.println("nums : "+nums);
		System.out.println("names : "+names);
		System.out.println("\n이름\t점수\t학점\t판정");
		for(int i=0;i<10;i++)	{
			tot +=nums2[i]; //tot = tot +nums[i];
			System.out.print(names2[i]+"\t");
		    System.out.print(nums2[i]+"\t");
		    if(nums2[i]>=90) {
		    	System.out.print("A\t");
		    } else if(nums2[i]>=80) {
		    	System.out.print("B\t");
		    } else if(nums2[i]>=70) {
		    	System.out.print("C\t");
		    } else if(nums2[i]>=60) {
		    	System.out.print("D\t");
		    } else{
		    	System.out.print("F\t");
		    }
		    if(nums[i]>=70) {
		    	System.out.print("합격\n");
		    } else	{
		    	System.out.print("탈락\n");
		    }
		    if(nums[i]>max) max=nums[i];
			if(nums[i]<min) min=nums[i];
		    
		}
		System.out.println("전체 총점 : "+tot+ "\t전체 평균 :"+(tot/10.0f));
		System.out.println("최대 점수 : ");
		System.out.println("최소 점수 : ");
	}

}
