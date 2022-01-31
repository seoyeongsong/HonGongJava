package section01.example06;

public class KeyboardToStringExample {
	public static void main(String[] args) {
		// byte 배열 객체 생성
		byte[] bytes = {72, 101, 108, 111, 32, 74, 97, 118, 97};
		
		// 문자열로 변환
		String str1 = new String(bytes);
		System.out.println("문자열 객체 확인 : " + str1);
		
		// 문자열 변환 및 슬라이싱
		String str2 = new String(bytes, 5, 4);
		System.out.println("문자열 객체 확인2 : " + str2);
	}
}