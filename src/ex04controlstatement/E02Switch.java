package ex04controlstatement;

import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

/*
 switch문
 	if문처럼 조건에 따라 분기하는 제어문으로, 정수식의 값과 동일한 부분을 찾아
 	실행하는 형태를 가지고 있다.
 	형식]
 		switch(산술식 or 정수식)
 		case 값1:
 			실행문1; break;
 			case 값1:
 			실행문1; break;
 */

public class E02Switch {

	public static void main(String[] args) {

		/*
		 Scanner 플래스
		 :KDF5.0부 터 추가된 클래스로 모드를 통해 사용자로부터
		 값을 입력받을 때 사용한다.
		 nextline() : 문자열을 입력받음
		 nextInt() ; 정수를 입력받음
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.");
		int iNum = scanner.nextInt();
		System.out.println("입력한 숫자는:"+ iNum);
		
		int remain = iNum % 3;
		
		
		switch (remain) {
		case 0:
			System.out.println("나머지는 0 입니다.");
			break;
		case 1:
			System.out.println("나머지는 1 입니다.");
			break;
		default:
		
			System.out.println("나머지는 2입니다.");
		}
		
		
		/*
		 switch문 사용시 주의 사항
		 -long 타입의 변수는 사용이 불가능하다.
		 -byte/short/int/char/String만 사용 가능하다.
		 */
		
//		long ln =100;
//		switch (ln) {
//		case 100:
//			System.out.println("long타입 사용??");
//		default:
//			System.out.println("안되는군!");	
//		}
//	    switch (iNum%3==0) {
//		    System.out.prin("논리식도 안되는군~");
	    
//		}
		
		/*
		 문자열이나 문자는 switch문에서 사용 가능하다.
		 */
		String title = "자바";
		switch (title) {
		case "자바" : System.out.println("자바 좋아");
			break;
		case "JAVA" : System.out.println("JABA Gooood");
			break;
		}
		
		/*
		 여러 case를 동시에 처리할때는 break문 없이 case를 나열한다.
		 if문에서 ||(논리or)로 연결한 것과 동일하다.
		 */
		
		
		int season = 4;
		switch (season) {
		case 3: case 4: case5: 
			System.out.println("봄 입니다.");
			break;
		case 6: case 7: case8:  case9:
			System.out.println("여름 입니다.");
			break;
			
		case 10:
			System.out.println("가을 입니다.");
			break;
		case 11: case 12: case1: case2: 
			System.out.println("겨울 입니다.");
			
		}
		
	}
}


