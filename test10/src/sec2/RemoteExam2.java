package sec2;

public class RemoteExam2 {

	Screen s1 = new Screen() {
		public void turnOff() {
			System.out.println("전원off");
			
		}

		
		public void turnOn() {
			System.out.println("전원on");
			
		}

		
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

		
		public int light() {
			System.out.println("밝게");
			if(this.lightness <255 && this.lightness > 0) {
				this.lightness++;
			}
			return this.lightness;
		}

		
		public int dark() {
			System.out.println("어둡게");
			if(this.lightness <255 && this.lightness > 0) {
				this.lightness--;
			}
			return this.lightness;

		}

		
		public int zoomin() {
			if(zoom>=-500 && zoom<=500) {
				zoom+=50;
			}
			return zoom;
		}

		
		public int zoomout() {
			if(zoom>=-500 && zoom<=500) {
				zoom-=50;
			}
			return zoom;
		}
	};


	Remotecontrol.changeBattery();
		s1.turnOn();
		s1.light();
		s1.light();
		s1.light();
		s1.dark();
		s1.zoomin();
		s1.zoomin();
		s1.zoomout();
		s1.setVolume(4);
		s1.setmute(true);
		s1.setmute(false);
		s1.turnOff();
	
	}
	
}	