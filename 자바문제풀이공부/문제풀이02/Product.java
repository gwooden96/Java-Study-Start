package 문제풀이02;

public class Product {

	int price;
	int bonusPoint;
	
	//부모 클래스에 기본생성자를 추가해줘야지 오류가 안남
	Product() { //기본생성자
		
	}
	
	Product(int price) {
		this.price = price;
		bonusPoint =(int)(price / 10.0);
	}
}
