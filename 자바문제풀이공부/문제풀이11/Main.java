package 문제풀이11;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
			
		
		long start = System.currentTimeMillis();
		
		ArrayList<Thread> threads = new ArrayList<>();

		for(int i = 0; i<5; i++) {
			Thread s = new Thread(new Study("s" + i));
			
			threads.add(s);
			s.start();
			
			
			}
		
		for(Thread t : threads) {
			t.join();
		}
		
		long end = System.currentTimeMillis();
			
	
		System.out.println("총 소요시간 : " + (end - start));
	
	}

}
