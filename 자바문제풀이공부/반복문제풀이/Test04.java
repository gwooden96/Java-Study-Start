package 반복문연습문제풀이;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// int타입의 변수 num을 입력받아 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라
		// 만일 변수 num의 값이 12345라면 1+2+3+4+5 = ? 의 결과인 15를 출력하라.
		
		
		int num = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 : "); 
		num = sc.nextInt();

			
			while(num != 0){ //num값이 0이 아닐때 무한반복
	            
	            sum += num%10; //num을 10으로 나눈 나머지를 sum에 더한다.
	            
	            num /= 10; //num을 10으로 나눈 값을 다시 num에 저장한다.
			
		}
			
			System.out.print("결과 : " + sum);
		
		
		
		
		/* 잘못된 풀이
		int[] num = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		
		for(int i = 0; i <num.length; i++) {
			
		System.out.println("숫자 입력 : "); 
		num[i] = sc.nextInt();
		
		}
		
		for(int i = 0; i <num.length; i++){
			sum += num[i];
		}
		
		System.out.println(sum);
		*/

	}

}
