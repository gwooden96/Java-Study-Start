package 반복문연습문제풀이;

public class Test02 {

	public static void main(String[] args) {
		//1+(-2)+3(-4)+..... 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100 이상 되는지 구하시고
		//결과 199
		
		int i = 0; //숫자(양수, 음수 표현x)
		int num = 0; //숫자(양수, 음수 표현 해주는 변수)
		int sum = 0; //합계 저장 변수
		int s = 1; //스위치 변수(1, -1)
		
		while(true) {
			i++; //0부터 시작해서 i값 증가
			num = i * s;
			//증가된 i값과 s를 곱하면 num값에 저장된다.
			//조건이 만족할때 까지 무한반복
			
			sum = sum + num;
			//처음에 num 값이 sum에 들어가고
			//sum 초기값이 바뀌면서 num값과 sum값을 더한 총합이 sum값으로 들어가고
			//무한 반복
			
			s = s * -1;
			
			if(sum >= 100) 
				break;

		} 
		
		
		System.out.println("숫자 : " + num);
		System.out.println("합계 : " + sum);

	}


}
