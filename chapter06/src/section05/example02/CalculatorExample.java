package section05.example02;

public class CalculatorExample {

	public static void main(String[] args) {
		// 정적 멤버 호출하기, 클래스 명으로 접근한다.
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 3);
		int result3 = Calculator.minus(5, 7);
		
		System.out.println("원의 넓이 구하기 : " + result1);
		System.out.println("더하기 연산 결과 : " + result2);
		System.out.println("빼기 연산 결과 : " + result3);

	}

}
