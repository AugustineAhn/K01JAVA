package ex05method;

/*
 [메소드형태2] 매개변수는 업ㅈㅅ고 반환값은 있는 경우
 	: 사용자로부터 입력값을 받은 후 연ㅅ한을 진행하고 셜과를
 	반환하거나 난수를 생성하는 경우 사용된다.
 */
public class E03MethodType02_1 {

	
	static int noParamYesReturn() {
		int sum = 0;
		for(int i=1 ; 1<=10; i++) {
			sum += i;
			return sum;
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1~10까지의 합:" + noParamYesReturn());
		
		int sum10 = noParamYesReturn();
		System.out.printf("1에서 10까지의 합은 %d 입니다,", sum10);
	}

}
