package 반복문연습문제풀이;

import java.util.Scanner;

/*
 *  다음은 숫자맞추기 게임을 작성한 것이다.
 *  1과 사이의 100 값을 반복적으로 입력 해서 컴퓨터가
 *  생각한 값을 맞추면 게임이 끝난다
 *  사용자가 값을 입력하면 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다
 *  사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고
 *  몇 번 만에 숫자를 맞췄는지 알려준다.
 *  
 *  ex) 컴퓨터가 랜덤으로 1~100숫자를 정함 ->(80이라고 가정)
 *  
 *  숫자 입력 : 50
 *  -> 입력한 숫자보다 크다
 *  숫자 입력 : 90
 *  -> 입력한 숫자보다 적다
 *  숫자 입력 : 80
 *  -> 맞췄습니다.
 *  총 시도 횟수는 3번입니다.
 */

public class Test05 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int userNum;
		int cnt = 0;
		
		num = (int)(Math.random()*100)+1;
		
		
		while(true) {

			System.out.println("숫자 입력 : ");
			userNum = sc.nextInt();
			cnt++;
			
			if(userNum > num) {
				System.out.println("입력한 숫자보다 크다");
				
			
			} if(userNum < num) {
				System.out.println("입력한 숫자보다 작다");
				
				
			} else if (userNum == num) {
				System.out.println("맞췄습니다");
				System.out.println("총 시도 횟수 : " + cnt);
				break;
			}
			
		}

		

	}

}
