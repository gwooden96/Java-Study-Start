package 반복문연습문제풀이;

public class Test01 {

	public static void main(String[] args) {
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오
		

		int i, j;
		int sum = 0; //각 구간별 합계
		int tot = 0; //전체 총합
		
		/* 1번 =========
		for(i = 0; i<=10; i++) {
			for(j = 1; j<=i; j++){
				sum = sum + j;
			}
		} 
		System.out.println("총합 : " + tot);
		*/	
		
		
		/* 2번 =========
		for(i = 1; i<=10; i++) {
			sum = 0; // 중간에 초기화
			for(j = 1; j<=i; j++){
				sum = sum + j;
			}
			tot = tot + sum;
		} 
		
		System.out.println("총합 : " + tot);
		*/
		
		
		//반복문 하나만 써서 결과값 도출
		for(i = 1; i<=10; i++) {
			sum = sum + i;
			tot = tot + sum;
		} 
		
		System.out.println("총합 : " + tot);

	}

}
