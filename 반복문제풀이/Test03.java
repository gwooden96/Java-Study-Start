package 반복문연습문제풀이;

public class Test03 {

	public static void main(String[] args) {
		//두 개의 주사위를 던졌을 대 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램 작성
		// <결과> (1, 5) (2, 4) (3, 3) (4, 2) (5, 1)
		
		
		for(int i = 1; i<=6; i++){
			for(int j = 1; j <=6; j++){
				if(i + j == 6) {
					
					System.out.println("1번 주사위 : " + i + ", " + " 2번 주사위 : "+ j + " = 6");
				}
			}
		
		}

	}

}
