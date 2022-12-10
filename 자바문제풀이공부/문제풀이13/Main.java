package 문제풀이13;

import java.util.stream.Stream;

//스트림 사용
	
public class Main {

	public static void main(String[] args) {

		String[] strArr = {"aaa", "bbb", "c", "dddd"};
		
		Stream<String> s = Stream.of(strArr);
		int len = s.mapToInt(String::length).sum();
		
		System.out.println(len);

	}

}
