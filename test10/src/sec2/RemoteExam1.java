package sec2;

public class RemoteExam1 {

	public static void main(String[] args) {
		RemoteControl r1;
		//RemoteControl()로 객체를 생성하려면 구현내용을 기술해야 한다.
		r1 = new RemoteControl() {
			public void setVolume(int volume) {
				if(volume > MAX) {
					this.volume = RemoteControl.MAX;
				}
				else if(volume < MIN) {
					this.volume = RemoteControl.MIN;			
				}
				else {
					this.volume = volume;
					System.out.println("현재볼륨:"+volume);
				}
			}

		RemoteControl.changeBattery();
		r1.turnOn();
		r1.setVolume(true);
		r1.setmute(true);
		r1.setmute(false);
		r1.turnOff();
			
}