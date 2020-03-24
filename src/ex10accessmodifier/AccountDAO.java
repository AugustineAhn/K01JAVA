package ex10accessmodifier;
/*
 DAO(Data Access Object)
 	: 데이터베이스의 data접근을 위한 객체이다.
 	주로 DB접근을 하기 위한 로직과 비즈니스로직을 분리하기 위해
 	사용한다. MVC패턴에서는 M(Model1)에 해당한다.

 	해당 예제에서는 DB접속을 위한 목적은 아니고 DTO 클래스에 저장된 데이터를
 	가공/처리하는 로직을 구현하기 위한
 	목적으로 제작되었다.
 */

public class AccountDAO {

	
	//private AccountDTO capsule = new AccountDTO();
	private AccountDTO capsule = new AccountDTO();
	//초기화
//	public void init(String name, String accNumber, int balance) {
//		capsule.setName(name);
//		capsule.setAccountNumber(accNumber);
//		capsule.setBalance(balance);
//	}
	public void init(String name, String accNumber, int balance) {
		capsule.setName(name);
		capsule.setAccountNumber(accNumber);
		capsule.setBalance(balance);
	}

	//저축
//	public void deposit(int money) {
//		capsule.setBalance(capsule.getBalance() + money);
//		System.out.println(money + "원이 입금되었습니다.");
//		printAccount();//계좌정보출력
//	}
	public void deposit(int money) {
		capsule.setBalance(capsule.getBalance()+money);
		System.out.println(money + "원이 입금되었습니다.");
		printAccount();
	}
	//출금
//	public void withdraw(int money) {
//		if (capsule.getBalance() < money) {
//			System.out.println("잔액 부족합니다.");
//			return;
//		}
//		capsule.setBalance(capsule.getBalance()-money);
//		System.out.println(money + "원이 출금되었습니다.");
//		printAccount();
//	}
	
	public void withdraw(int money) {
		if (capsule.getBalance()<money) {
			System.out.println("잔액이 부족합니다.");
		}
		capsule.setBalance(capsule.getBalance()-money);
		System.out.println(money+"원이 출금되었습니다.");
		printAccount();
	}
	public void printAccount() {
		System.out.printf("[%s님의 계좌정보]\n", capsule.getName());
		System.out.printf("계좌번호:%s\n", capsule.getAccountNumber());
		System.out.printf("잔액:%d원\n", capsule.getBalance());
	}
		
	
	


}
