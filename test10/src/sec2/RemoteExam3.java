package sec2;

public class RemoteExam3 {

	public static void main(String[] args) {
		Television tel1 =new Television();
		
		RemoteControl.changeBattery();
		tel1.turnOn();
		tel1.setVolume(20);
		tel1.setMute(true);
		tel1.setMute(false);
		tel1.light();
		tel1.dark();
		tel1.zoomin();
		tel1.zoomout();
		tel1.turnOff();
	}

}
