package 클래스복습문제풀이;

import java.util.Arrays;

//메서드 이름 xxxx shuffle(xxxx) {
/*
 * 메서드명 : shuffle
 * 기능 : 배열에 담긴 값의 위치를 바꾸는 작업
 * 리턴타입 : 정수형 배열
 * 매개변수 : 정수형 배열
 */

public abstract class Test03 {

	//메서드 생성 위치
	public static int[] shuffle(int[]arr) {
		int temp; //임시 저장소
		
		for(int i = 0; i<arr.length; i++) { //배열방
			int j = (int)(Math.random()*arr.length); //j 변수안에 랜덤한 숫자가 계속 대입
			
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		int[] result = shuffle(arr);
		System.out.println(Arrays.toString(result));
		
		
		/*
		 * 결과 예시
		 * {6,1,3,7,8,2,4,5,9}
		 */

	}

}
