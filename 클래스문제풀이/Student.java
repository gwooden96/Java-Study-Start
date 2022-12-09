package 클래스복습문제풀이;

public class Student {
	
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	public Student() {
		
	}

	public Student(String name, int ban, int no, int kor, int eng, int math) {

		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	
	int getTotal() {
		
		return kor + eng + math;
	}
	
	
	double getAverage(){
		
		return getTotal()/3.0;
	}

	
	
	void info() {
		System.out.println("이름 : " + name);
		System.out.println("반 : " + ban);
		System.out.println("번호 : " + no);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + getTotal());
		System.out.println("평균 : " + getAverage());
	}

}
