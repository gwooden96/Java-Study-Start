package 문제풀이14;

import java.util.Arrays;

/**
 * 홀수만 2를 곱해서 result에 저장한 후 출력
 */

public class Main {

	public static void main(String[] args) {
		int[] n = {1,2,3,4,5}; //정수 배열방 선언
		int[] result = Arrays.stream(n) //스트림을 이용하기 위해서는 먼저 생성을 해야 한다.
				.filter(a -> a % 2 == 1) //필터 조건
				.map(a -> a * 2)
				.toArray(); //배열로 형변환

				
		System.out.println(Arrays.toString(result));

	}

}
