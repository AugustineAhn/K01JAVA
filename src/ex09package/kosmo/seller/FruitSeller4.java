package ex09package.kosmo.seller;

public class FruitSeller4 {

	
		int numOfApple ; //판매자의 사과 보유갯수
		int myMoney ;//판매수익
		int apple_price ;//사과의 단가-> 일반 변수로 변경함.
		
		public void initMembers(int money, int appleNum, int price) {
			myMoney = money;
			numOfApple = appleNum;
			apple_price = price;
		}

		public int saleApple(int money) {
			int num = money /apple_price;
			numOfApple -= num;
			myMoney += money;
			return num;

		}

		public void showSaleResult() {
			System.out.println("[판매자] 남은 사과 갯수:" + numOfApple);
			System.out.println("[판매자] 판매수익:" + myMoney);

		}

	}
	


