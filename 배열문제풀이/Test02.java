package 배열복습문제풀이;

import java.util.Scanner;

/*
 * 거슬러 줄 금액을 입력받아 계산한다
 * 보유한 동전의 개수로 거스름돈을 지불할 수 없으면
 * 거스름 돈이 부족합니다. 라고 출력하고 종료한다.
 * 
 * 지불할 돈이 충분히 있으면
 * 거스름돈을 지불한 만큼 가진 돈에서 빼고
 * 남은 동전의 개수를 화면에 출력한다
 * 
 * <출력 결과>
 * 거스름 받을 금액을 입력하세요 : 2680
 * 
 * money = 2680
 * 500원 : 5
 * 100원 : 1
 * 50원 : 1
 * 10원 : 3
 * =남은 동전의 개수=
 * 500 : 0
 * 100 : 4
 * 50 : 4
 * 10 : 2
 */

public class Test02 {

	public static void main(String[] args) {
		
		int[] coinUnit = {500, 100, 50, 10};//동전 단위 저장 배열
		int[] coin = {5, 5, 5, 5}; //동전 개수 저장 배열

		
//		coinUnit[coin[i] * 5]; 
		int i;
		int money; //입력 받은 돈
		int coinTemp; //동전 개수 임시 보관
		int tot = 0;

		
		
		//거슬름 받을 금액 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("거스름 받을 돈을 입력하시오 : ");
		money = sc.nextInt();
		
		//coin배열과 coinUnit배열을 0번부터 끝번까지 반복시켜 곱한 값을 tot에 대입 누적 시킨다.
		for(i = 0; i<coin.length; i++) { //3000
			tot += coin[i] * coinUnit[i];
			
		}
		
		//무한루프

			if(money < tot) {
			
		
																					//각 배열방에 거스름돈 단위로 총합 저장
				for(i = 0; i<coin.length; i++) { //3000
					
					coinTemp = 0; //초기화
					
					coinTemp = money / coinUnit[i]; //금액에서 동전단위 나눠서 동전 개수 구함
					
					if(coinTemp > coin[i]) { //가지고 있는 동전 개수보다 크냐?
						coinTemp = coin[i]; // <-- 가지고 있는 동전개수로 지정
						coin[i] = 0;
					} else {
						coin[i] = coin[i] - coinTemp; // coinTemp가 5개 보다 적을 경우 뺀 나머지 금액
					}
					
					
					money = money - coinUnit[i] * coinTemp; //
					
					System.out.println(coinUnit[i] + "원 : " + coinTemp + "개");
					}
				
				
					System.out.println("=== 남은 동전 개수 ===");
					for(i = 0; i<coin.length; i++) {
						System.out.println(coinUnit[i] + "원: " + coin[i] + "개");
					}
				
						} else {
							System.out.println("잔액이 부족합니다.");
						} 				
		
		}
	

}
