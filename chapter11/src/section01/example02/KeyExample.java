package section01.example02;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// Key 객체를 식별키로 하여 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		// put() 메소드로 키:값 데이터 넣기
		// 1 : 홍길동 추가
		hashMap.put(new Key(1), "홍길동");
		// 2 : 김자바 추가
		hashMap.put(new Key(2), "김자바");
		
		// get() 메소드로 hashMap 에 저장된 데이터 읽기
		String value = hashMap.get(new Key(1));
		
		System.out.println("value 확인하기 : " + value);
	}
}
