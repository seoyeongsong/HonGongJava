package section05.example02;

public class CalculatorExample {

	public static void main(String[] args) {
		// ���� ��� ȣ���ϱ�, Ŭ���� ������ �����Ѵ�.
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 3);
		int result3 = Calculator.minus(5, 7);
		
		System.out.println("���� ���� ���ϱ� : " + result1);
		System.out.println("���ϱ� ���� ��� : " + result2);
		System.out.println("���� ���� ��� : " + result3);

	}

}
