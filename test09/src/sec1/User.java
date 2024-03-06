package sec1;

public abstract class User {
	protected String ip;
	protected int port;
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public abstract void connect();	//클래스명 앞에도 abstract 적어줘야 함. 
									//추상 메소드: 메소드의 기능 구현내용을 기술하지 않고, 선언
	@Override
	public String toString() {
		return "User [ip=" + ip + ", port=" + port + "]";
	}
	
}
