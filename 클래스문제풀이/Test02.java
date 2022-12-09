package 클래스복습문제풀이;

public class Test02 {

	public static void main(String[] args) {


	
		
		Student s = new Student();
		
		s.name ="홍길동";
		s.ban = 1;
		s.no = 2;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
//		System.out.println("이름: " + s.name);
//		System.out.println("총점: " + s.getTotal());
//		System.out.println("평균: " + s.getAverage());
		
		System.out.println("===인포====");
		s.info();

	}

}
