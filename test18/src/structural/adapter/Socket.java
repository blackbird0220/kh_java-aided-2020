package structural.adapter;
//110볼트를 출력하는 클래스
public class Socket {
	public Volt getVolt() {
		return new Volt(110);
		
	}
}
