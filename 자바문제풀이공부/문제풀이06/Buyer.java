package 문제풀이06;

public class Buyer {
	
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품 저장 배열
	int i = 0; // cart 배열 변수에 사용될 인덱스
	
	void add(Product p) {
		/**
		 * 1. i 값이 장바구니 크기보다 같거나 크면?
		 * 	1-1. 기존 장바구니보다 2배 큰 새로운 배열을 생성
		 * 	1-2. 기존 장바구니의 내용을 새로운 배열에 복사
		 * 	1-3. 새로운 장바구니와 기존 장바구니를 교체
		 * 2. 물건을 장바구니(cart)에 저장, 그리고 i 증가
		 */
		
		if(i >= cart.length) {
			Product[] cart2 = new Product[cart.length*2];
			System.arraycopy(cart, 0,  cart2, 0, cart.length); 
			cart = cart2;

		}
		
		cart[i] = p;
		i++;
	}
	
	/** 기능 구현 */
	
	void buy(Product p) {
		/**
		 * 1. 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드 종료
		 * 2. 가진 돈이 충분하면 제품의 가격을 가진 돈에서 뺌
		 * 3. 장바구니에 구입한 물건을 담는다 (add메서드 호출)
		 */
		
		if(money < p.price) {
			System.out.println("잔액이 부족하여" + p + "를 살수 없습니다.");
			return ;
		} 
			money -= p.price;
			
			add(p);
	
	}

	void summary() {
		/**
		 * 1. 장바구니에 담긴 물건의 목록을 만들어 출력
		 * 2. 장바구니에 담긴 물건의 가격을 모두 더해서 출력
		 * 3. 물건을 사고 남은 금액(money)을 출력
		 */
		
		int j;
		int sum = 0;
		
		for(j = 0; j < cart.length; j++) {
			System.out.print(cart[j] + ", ");
			
			sum = sum + cart[j].price;
		}
		
		System.out.println();
		System.out.println("사용한 금액 : " + sum);
		System.out.println("남은 금액 : " + money);
	}

}
