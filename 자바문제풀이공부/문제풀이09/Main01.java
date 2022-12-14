package 문제풀이09;

import java.util.ArrayList;

public class Main01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		ArrayList<Integer> kyo = new ArrayList<>(); //교집합
		ArrayList<Integer> cha = new ArrayList<>(); //차집합
		ArrayList<Integer> hap = new ArrayList<>(); //합집합
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		//list1{1,2,3,4}
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		//list2{1,2,3,4}

		
		/**
		 * kyo : list1과 list2의 교집합을 구하는 코드
		 * cha : list1과 list2의 차집합을 구하는 코드
		 * hap : list1과 list2의 합집합을 구하느 코드
		 */
		
		kyo.addAll(list1);
		kyo.retainAll(list2);
		
		cha.addAll(list1);
		cha.removeAll(list2);
		
		hap.addAll(list1);
		hap.removeAll(list2);
		hap.addAll(list2);
		

		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		

		System.out.println("kyo : " + kyo);
		System.out.println("cha : " + cha);
		System.out.println("hap : " + hap);
		
	}

}
