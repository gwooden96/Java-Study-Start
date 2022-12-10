package 문제풀이01;

public class MyTv {
	/** 상수 */
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0 ;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
		/** (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.*/
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
		/** (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다 */
		if(volume < MAX_VOLUME) { //volume = 0 < MAX_VOLUME = 100
			volume++; //증가
		} 
	}
	
	void volumeDown() {
		/** (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소키니다 */
		if(volume > MIN_VOLUME) {
			volume--;
		} 
	}
	
	void channelUp() {
		/**
		 *  (4) channel의 값을 1증가시킨다
		 *  channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다
		 */

		if(channel == MAX_CHANNEL) { //channel이 MAX_CHANNEL과 같을때 ==
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
	}
	
	void channelDown() {
		/** 
		 * (5) channel의 값을 1감소시킨다
		 * channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다
		 */
		
		if(channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		} else {
			channel--;
		}
	}

}
