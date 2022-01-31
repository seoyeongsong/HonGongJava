package section02.example01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		// Date 객체 생성하기
		Date date = new Date();
		// 현재 날짜와 시간 정보를 문자열로 리턴
		String strNow1 = date.toString();
		System.out.println("strNow1 : " + strNow1);
		
		// 원하는 포맷으로 변경하여 날짜 정보 얻기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(date);
		System.out.println("strNow2 : " + strNow2);
		
	}
}
