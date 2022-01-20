package section04.example06;

public class CalculatorExample {

	public static void main(String[] args) {
		// 객체 외부에서 메소드 호출하기 위해 객체부터 생성
		Calculator myCalc = new Calculator();
		
		// 정사각형 넓이 구하기
		double result1 = myCalc.areaRectangle(10);
		System.out.println("정사각형 넓이 구하기 : " + result1);
		
		// 직사각형 넓이 구하기
		double result2 = myCalc.areaRectangle(10, 5);
		System.out.println("직사각형 넓이 구하기 : " + result2);

	}

}
