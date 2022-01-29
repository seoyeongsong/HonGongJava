package section02.example01;

public class CarExample {
	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car();
		
		// 메소드 호출
//		myCar.run();
		
		// 타이어 교체
		myCar.backLeftTire = new KumhoTire();
		myCar.frontLeftTire = new KumhoTire();
		
		myCar.run();
	}
}