package 문제풀이15;

import java.util.Random;

//로도번호 출력
public class Main {

	public static void main(String[] args) {
		
		new Random().ints(1, 46)
				.distinct() //중복값 제거
				.limit(6) //일정 개수만큼만 가져와서 새로운 스트림을 리턴
				.sorted() //요소들을 정렬하여 새로운 스트림을 생성
				.forEach(System.out::println); //출력
	}
}
