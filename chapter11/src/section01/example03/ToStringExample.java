package section01.example03;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println("Object.toString() : " + obj.toString());
		System.out.println("=====================================");
		// ���� Ŭ������ �����ǵ� toString() �޼ҵ�
		Date date = new Date();
		System.out.println("Date.toString() : " + date.toString());
	}
}