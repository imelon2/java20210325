package p08.textbook.s080402;

import p06.textbook.s061003.Television;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControlExample rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
	}
}
