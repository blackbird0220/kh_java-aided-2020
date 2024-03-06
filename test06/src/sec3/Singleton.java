package sec3;
//싱글톤 : 하나의 객체 생성만 허용하는 클래스
public class Singleton {
	private static Singleton instance; //정적 개체 선언, 공유데이터 됨
	private Singleton() { }	//외부에서 생성할 수 없도록 private
	public static synchronized Singleton getInstance() { //getInstance()호출시 생성
	//public private 헷갈리지 않게 조심
		if(instance == null) instance = new Singleton();
		return instance; 
	}
}
