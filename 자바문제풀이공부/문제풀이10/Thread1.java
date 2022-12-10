package 문제풀이10;

public class Thread1 extends Thread{
	
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println("스레드1 : " +i);
		}
	}

}
