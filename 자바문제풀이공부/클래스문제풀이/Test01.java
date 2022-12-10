package 클래스복습문제풀이;

/*
 * 다음과 같은 변수를 가지는 Student 클래스를 완성하시오
 * 데이터 타입	변수명	설명
 * 문자열		name	이름
 * 정수		ban		반
 * 정수		no		번호
 * 정수		kor		국어점수
 * 정수		eng		영어점수
 * 정수		math	수학점수
 * 
 * 메서드
 * 메서드명 : getTotal
 * 기능 : 국어, 영어, 수학점수를 다 더해서 반환함
 * 리턴타입 : 정수
 * 매개변수 없음
 * 
 * 메서드명 : getAverage
 * 기능 : 총점을 과목수(3)로 나눈 평균을 반환함
 * 리턴타입 : 실수
 * 매개변수 없음
 */

public class Test01 {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.name ="홍길동";
		s.ban = 1;
		s.no = 2;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름: " + s.name);
		System.out.println("총점: " + s.getTotal());
		System.out.println("평균: " + s.getAverage());

	}

}
