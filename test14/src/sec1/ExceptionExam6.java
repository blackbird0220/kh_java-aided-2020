package sec1;
//ClassNotFoundException : 해당 클래스를 찾을 수 없는 경우. 즉, 드라이버의 패키지 이름이 틀렸거나 라이브러리
public class ExceptionExam6 {

	public static void main(String[] args) {
		try {
			Class driver = Class.forName("oracle.jdbc.driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("원인불명");
		} finally {
			System.out.println("종료");
		}

	}

}
