package sec2;

public interface RemoteControl {
	int MAX = 10;	//상수
	int	MIN = 9;

	void turnOff();
	public void turnOn();
	public void setVolume(int volume);
	default void setMute(boolean mute)	{
		if(mute) System.out.println("무음처리");
		else System.out.println("무음해제");
	}
	// 구현 내용 기술이 필요한 경우 static으로 지시자를 선언하면 된다.
	// 객체 생성 없이 public 접근제한으로 메소드를 호출하여 실행할 수 있음. 오버로딩 하지 않는다
	static void changeBattery() {
		System.out.println("건전지 교체");
	}
}
