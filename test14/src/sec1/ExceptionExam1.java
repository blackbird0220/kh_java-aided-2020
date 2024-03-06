package sec1;
//예외 처리/ 프로그래밍 로직 상 에러가 발생하면, 그 이후의 처리 문장은 처리되지 못하고 실행이 중지됨
//이런한 경우를 예외(Exception)이라고 하며, 그렇다면, 다음 문장까지 실행될 수 있도록
//예외사항을 계속 다음 문장도 처리될 수 있도록 하는 것을 예외 처리라고 합니다. 
public class ExceptionExam1 {
	public static void main(String[] args) {
		String name = null;
		//실제 처리할 문장(try)의 예외가 발생하면, 예외처리 문장(catch)을 실행
			try {
		//실제 처리할 문장
			System.out.println(name.toString());
				
			}catch(NullPointerException e) {
			e.printStackTrace();
			name = "kew";
			System.out.println("알 수 없는 예외가 발생하였습니다");

			}catch(Exception e) {
			System.out.println("알 수 없는 예외가 발생하였습니다");
	 }
	}
}
