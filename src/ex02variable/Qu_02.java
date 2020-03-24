package ex02variable;

public class Qu_02 {

	/*
	 국어,영어,수학 점수를 99, 80, 96점으로 입력하고 
평균점수를 구해서 출력하는 프로그램을 작성하시오.
출력결과]
	99점,80점,96점의 평균점수는 XXX.XX점입니다.(실수형태)
	99점,80점,96점의 평균점수는 XXX점입니다.(정수형태)


	 */
	public static void main(String[] args) {

		int kor = 99, eng = 80, mat = 96;
		double avg = (kor+eng+mat) / 3.0;
		System.out.printf("평균점수:%f%n", avg);
		int avg2 = (kor + eng + mat)/3;
		
		System.out.printf("평균점수는(실수형태)" + avg + "점입니다.");
		System.out.println();
		System.out.println("평균점수는(정수형태) " + avg2 + "점입니다.");
	}

}
