package 문제풀이01;

/*
 * <실행결과>
 * CH:100, VOL:0
 * CH:99, VOL:0
 * CH:100, VOL:100
 */

public class MyTvMain01 {

	public static void main(String[] args) {

		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);

	}

}
