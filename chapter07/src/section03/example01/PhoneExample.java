package section03.example01;

public class PhoneExample {

	public static void main(String[] args) {
		// 객체 생성
		SmartPhone smartphone = new SmartPhone("홍길동");
		
		smartphone.turnOn();			// 추상클래스의 메소드
		smartphone.internetSearch();	// 상속클래스의 메소드
		smartphone.turnOff();			// 추상클래스의 메소드
	}
}