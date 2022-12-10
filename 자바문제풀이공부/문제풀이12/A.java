package 문제풀이12;

public class A {
	
	public static void main(String[] args) {

		
		Lamda max = (a, b) -> a > b ? a : b;
		

	
		Lamda1 var = (name, i) -> {
		System.out.println(name + "=" + i);
		};
		
		
		Lamda2 sq = (x) -> {
			return x * x;
		};
	
		Lamda3 sa = (arr) -> {
			int sum = 0;
			for(int i : arr)
				sum += i;
			return sum;
		};
		
		Lamda4 ro = () -> (int)(Math.random()*6);
		

	}
}
