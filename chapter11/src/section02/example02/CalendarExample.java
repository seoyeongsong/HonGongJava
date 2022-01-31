package section02.example02;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		// Calendar ��ü�� getInstance()�� ���
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
//		System.out.println("year : " + year);
//		System.out.println("month : " + month);
//		System.out.println("day : " + day);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "��";
			break;
		case Calendar.TUESDAY:
			strWeek = "ȭ";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "��";
			break;
		case Calendar.THURSDAY:
			strWeek = "��";
			break;
		case Calendar.FRIDAY:
			strWeek = "��";
			break;
		case Calendar.SATURDAY:
			strWeek = "��";
			break;
		case Calendar.SUNDAY:
			strWeek = "��";
			break;
		}
//		System.out.println("���� : " + strWeek);
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "����";
		}else {
			strAmPm = "����";
		}
		System.out.println("strAmPm : " + strAmPm);
	}
}
