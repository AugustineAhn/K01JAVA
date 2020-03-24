package ex04controlstatement;

import java.util.Scanner;

/*
 if문
    형식3]
       if(조건){
       		실행문1;
       	}
       	else if (조건2){
       		실행문2;
       	}
        else{
        	위 모든 조건이 거짓일때 실행할 문장;
        }
        * else문에는 조건 없음
 */
public class E01If03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 시나리오] 국, 영, 수 점수의 평균값을 구 하여 학점을 출력하는
		 프로그램을 작성하시오. 90점 이상은 A 학점, ......
		 60점 미만은 F학점으로 판단하여 출력합니다.
		 */
		
		int kor = 82;
		int eng = 98;
		int math = 58;
		
		
		int avg = (kor+eng+math) / 3;
		
		switch(avg) {
		case 10: case9:
			System.out.println("A학점");break;
		case 8:
			System.out.println("B학점");break;
		case 7:
			System.out.println("C학점");break;
		case 6:
			System.out.println("D학점");break;
		default:
			System.out.println("F학점");break;
		}
		
		
		/*
		 if~else 구문을 구성할 때는 조건의 구간을 어떻게 설정하느냐에 따라
		 전혀 다른 결과가 나올 수 있으므로 주의해야 한다.
		 아래 문장은 높은 점수라 할지라도 60 이상의 조건에 만족하므로 무조건
		 D학점이 출력된다.
		 */
		System.out.println("잘못된 조건식의 if문");
		if (avg>=60) {
			System.out.println("D학점");
		}
		else if (avg>=70) {
			System.out.println("C학점");
		}
		else if (avg>=80) {
			System.out.println("B학점");
		}
		else if (avg>=90) {
			System.out.println("A학점");	
		}
		else {
			System.out.println("F학점.  학사경고ㅜㅠ;");
		}
		
	}
		

}
