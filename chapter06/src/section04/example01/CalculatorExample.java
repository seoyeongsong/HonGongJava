package section04.example01;

public class CalculatorExample {

	public static void main(String[] args) {
		// 객체 생성하기
		Calculator mycalc = new Calculator();
		mycalc.powerOn();
		
		int result1 = mycalc.plus(5, 7);
		System.out.println("더하기 메소드의 결과 : " + result1);

		
		double result2 = mycalc.divide(10, 3);
		System.out.println("나누기 메소드의 결과 : " + result2);
		
		mycalc.powerOff();
	}

}
