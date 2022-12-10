package 문제풀이06;

/**
 * 다음은 물건을 구입하는 사람을 정의한 클래스이다
 * 이 Buyer클래스는 멤버변수(money) (cart)로 돈 과 장바구니를 가지고 있다
 * 제품을 구입하는 기능의 buy 메서드와
 * 
 * 장바구니에 구입한 물건을 추가하는 add메서드
 * 
 * 구입한 물건의 목록과 사용금액 그리고 남은 금액을 출력하는
 * summary 메서드를 완성하시오.
 * 
 * <실행결과>
 * 잔액이 부족하여 Computer를 살수 없습니다.
 * 구입한 물건 : Tv, Computer, Tv Audio, Computer, Computer, Computer
 * 구입한 금액 : 850
 * 남은 금액 : 150
 *
 */

public class Main {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();

	}

}
