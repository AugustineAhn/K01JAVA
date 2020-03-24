package ex09package.kosmo.buyer;

import ex09package.kosmo.seller.FruitSeller4;

/*
 FruitSeller4 클래스는 외부 패키지에 정의되어 있으므로
 반드시 import 해야 한다. buyApple() 메소드에서
 매개변수로 사용되고 있기 때문이다.
 */



public class FruitBuyer4 {
	public FruitBuyer4() {
		// TODO Auto-generated constructor stub
	}
	int myMoney ;//보유한 금액
	int numOfApple ;//구매한 사과의 갯수


	/*
	초기화메소드 
		: 멤버변수를 초기화할 때 사용한다. 2차버전에서는
		생성자 대신 사용되고 있으며, 객체 초기화시 여러줄에
		걸쳐 코딩해야 하는 번거로움을 간편하게 해결할 수 있다.
	 */
	public void initMemebers(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		myMoney = _numOfApple;

	}


	public void buyApple(FruitSeller4 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;

	}

	public void showBuyResult () {
		System.out.println("[구매자] 현재 잔액:" + myMoney);
		System.out.println("[구매자] 현재 사과 갯수:" + numOfApple);


	}


}
