package sec3;

import java.util.Arrays;

//Stream : 입출력 방식의 제어
public class StreamExam {
	public static void main(String[] args) {
		int[] arr = {95, 80, 100, 85, 90}; //배열 선언
		Arrays.stream(arr).forEach(n -> System.out.println(n));
		//stream을 이용한 합계 계산
		int sum = Arrays.stream(arr).sum();
		//stream을 이용한 평균 계산
		OptionalDouble avg = Arrays.stream(arr).average();
		//stream을 이용한 최대값 계산
		OptionalInt max = Arrays.stream(arr).max();
		//stream을 이용한 최소값 계산
		OptionalInt min = Arrays.stream(arr).min();
		//stream을 이용한 요소수 계산
		int cnt = (int) Arrays.stream(arr).count();
		System.out.println("");
	}

}
