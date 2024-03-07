package sec2;
//단순 함수 
public class ThrowExam2 {

	public static void main(String[] args) { //main 메소드에 throws로 예외를 떠넘기지 않는 경우
		String name = null;
		nullPassing(name);
		//int[] arr = new int[3];
		int[] arr = {100,80,90};
		String data = "kim1004";

	}
	public static void nullPassing(String name)throws NullPointerException {
		System.out.println(name);
	}

	public static void arrayPassing(int[] arr) throws ArrayIndexOutOfBoundsException { 
		int tot = 0;
		for(int i=0; i<10; i++) {
			System.out.println(arr[i]);
			tot += arr[i];
		}
		System.out.println("합계 :"+tot);
	}
	
}
