package section01.example03;

public class ComputerExample {

	public static void main(String[] args) {
		
		int r = 10;
		
		Calculator calc = new Calculator();
		System.out.println("원의 면적 : " + calc.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("원의 면적 : " + com.areaCircle(r));
	}
}
