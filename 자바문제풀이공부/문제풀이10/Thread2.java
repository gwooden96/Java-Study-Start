package 문제풀이10;

public class Thread2 implements Runnable {

	public void run() {
		for(int i = 0; i<=100; i++) {
			System.out.println("스레드2 : " + i);
		}
		
	}

}
