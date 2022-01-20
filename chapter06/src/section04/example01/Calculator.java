package section04.example01;

public class Calculator {
	
	// 리턴값이 없는 메소드의 경우 void 로 선언
	void powerOn() {	// 매개변수가 없다.
		System.out.println("계산기의 전원을 켭니다.");
	}
	
	// 더하기 연산의 경우 매개변수와 리턴값이 존재한다.
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// 나누기 연산
	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}
	
	void powerOff() {
		System.out.println("계산기의 전원을 끕니다.");
	}
}
