package section05.example04;

public class Singleton {
	// 정적 변수 선언 : 객체 생성하여 초기화
	private static Singleton singleton = new Singleton();
	
	// 메소드 선언
	private Singleton() {
		
	}
	
	// 외부에서 객체 접근 가능한 getInstance() 메소드
	static Singleton getInstance() {
		// 상단에 선언한 객체를 리턴
		return singleton;
	}
}
