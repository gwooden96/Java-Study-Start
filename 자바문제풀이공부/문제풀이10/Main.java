package 문제풀이10;

/**
 * 클래스를 2개 생성
 * Thread1 -> Thread 클래스를 상속
 * Thread2 -> Runnable 인터페이스 상속(구현)
 * 
 * 각각 1~100까지를 출력을 구현
 * 
 * 메인 -> 실행
 */

public class Main {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		
		Thread t2 = new Thread(new Thread2());
		
		//쓰레드 실행은 .start 메서드로 실행
		t1.start();
		t2.start();

	}

}
