package 문제풀이07;

public class Sample01 {

	public static void main(String[] args) {
		
		Outer ot = new Outer();
		Outer.Inner oir = ot.new Inner();
		
		System.out.println(oir.iv);
		
		oir.method();
	
	}

}

class Outer {
	int value = 10;
	
	class Inner {
		
		int iv = 100;
		int value = 20;
		
		void method() {
			int value = 30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer.this.value);
		}
	}
	

}
