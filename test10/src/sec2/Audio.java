package sec2;

public class Audio implements RemoteControl{
	int volume;
	
	@Override
	public void turnOff() {
		System.out.println("전원 끄기");
		
	}

	@Override
	public void turnOn() {
		System.out.println("전원 켜기");
		
	}

	@Override
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
	
}
