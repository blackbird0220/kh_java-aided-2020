package sec2;
//리모드컨드롤로 선언하여 RemoteControl, Screen, Television, Audio로 형변환하여 활용하기
public class RemoteExam5 {

	public static void main(String[] args) {
		RemoteControl r;	//RemoteControl 객체선언
		r = new RemoteControl() {
			int volume;
			public void turnOff() {System.out.println("기기전원off");}
			public void turnOn() {System.out.println("기기전원on");}
			public void setVolume (int volume) {
				if(volume > MAX) this.volume) = RemoteControl.MAX;
				else if(volume < MIN) this.volume = RemoteControl.MIN;
				else this.volume = volume;
					
				}
			}
		}
	}

}
