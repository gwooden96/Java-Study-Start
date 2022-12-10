package 반복문연습문제풀이;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		/*
		 * 입력받은 숫자가 회문수인지 출력하는 프로그램을 완성하시오.
		 * 회문수란? 12321, 15751, 131 -> 앞으로 읽어도, 뒤로 읽어도 똑같은걸 회문수
		 * ★힌트 : 입력받은 숫자를 뒤집어서 저장 ex) 123456 -> 654321 특정 변수에 저장
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int temp;
		int result = 0;
		
		System.out.println("숫자 입력 : ");
		num = sc.nextInt();
		
		temp = num;
		
		//숫자
		while(temp != 0){ 
            
           result = result * 10 + temp % 10;
           temp = temp / 10;
           
           /*
            * result     temp * 10 + % 10;
            * 0			123456 = 0 + 6
            * 6			12345 = 60 + 5
            * 65		1234 = 650 + 4
            * 654		123 = 6540 + 3
            * 6543		12 = 65430 + 2
            * 65432		1 + 654320 + 1
            * 654321	0 = 654321 + 0 <-- 끝내기
            */
		}
		
		System.out.println("뒤집어진 숫자 : " + result); //기존 num 값을 temp에 복사해서 넣기
	
		
	
		//if문 조건식
		if (num == result) {
			System.out.println("입력하신 " + result + " 숫자는 회문수 입니다");
		} else {
			System.out.println("입력하신  " + result + " 숫자는 회문수가 아닙니다.");
		}

	}

}
