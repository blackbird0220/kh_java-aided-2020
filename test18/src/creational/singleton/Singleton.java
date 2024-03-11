package creational.singleton;

public class Singleton {
	private static Singleton instance; 
	private int msg;

	
	public static Singleton getInstance(int msg) { //static 메소드는 객체 생성 없이 싱글톤인스턴스명 = Singleton.getInstance(정수)
		return instance;
	}
	public static void setInstance(Singleton instance) {
		Singleton.instance = instance;
	}
	public int getMsg() {
		return msg;
	}
	public void setMsg(int msg) {
		this.msg = msg;
	}
	
	
}
