package 문제풀이11;

public class Study implements Runnable {
	
	String name;
	
	public Study(String name) {
		this.name = name;
	}
	
	public void run() {
		
		work();
			
		}
	
		public void work() {
		for(int i = 0; i<5; i++) {
			try {
				Thread.sleep(200);
			}catch(Exception e) {
				
			}
		}
		
		System.out.println(name + "끝");
		}


}
