package section01.example03;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println("Object.toString() : " + obj.toString());
		System.out.println("=====================================");
		// 하위 클래스의 재정의된 toString() 메소드
		Date date = new Date();
		System.out.println("Date.toString() : " + date.toString());
	}
}