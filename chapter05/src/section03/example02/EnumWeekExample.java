package section03.example02;

import java.util.Calendar;

import section03.example01.Week;

public class EnumWeekExample {

	public static void main(String[] args) {
		// 열거 타입 변수를 선언
		Week today = null;
		
		// getInstance() 메소드로 Calendar 객체를 생성
		Calendar cal = Calendar.getInstance();
		
		// Calendar 객체에서 요일을 정수로 리턴하는 필드를 사용 (일:1 ~ 토:7)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
			
		}
		System.out.println("week 확인하기 : " + week);
		System.out.println("오늘 요일 확인하기 : " + today);

	}

}
