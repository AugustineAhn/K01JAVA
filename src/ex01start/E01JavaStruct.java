package ex01start;

import java.text.SimpleDateFormat;
import java.util.Date;

public class E01JavaStruct {

	public static void main(String[] args) {
		
		System.out.println("자바의 간략한 구조");
		
		Date toDayofDate = new Date();//Date class로 오늘날짜 출력하기
		
		System.out.println("오늘 날짜:" + toDayofDate);
		
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//SimpleDateFormat 클래스를 이용하여 우리가 흔히 사용하는 포맷인 년-월-일-시:분:초 형태로 변환하여 출력
		String toDayString = simple.format(toDayofDate);
		System.out.println("변형된 날짜:" + toDayString);
		
		
		}

}
