package 문제풀이03;

public class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private final int MAX_VOLUME = 100;
	private final int MIN_VOLUME = 0 ;
	private final int MAX_CHANNEL = 100;
	private final int MIN_CHANNEL = 1;


	public boolean isPowerOn() {
		return isPowerOn;
	}

	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	
	
}
