package section04.example01;

public class CalculatorExample {

	public static void main(String[] args) {
		// ��ü �����ϱ�
		Calculator mycalc = new Calculator();
		mycalc.powerOn();
		
		int result1 = mycalc.plus(5, 7);
		System.out.println("���ϱ� �޼ҵ��� ��� : " + result1);

		
		double result2 = mycalc.divide(10, 3);
		System.out.println("������ �޼ҵ��� ��� : " + result2);
		
		mycalc.powerOff();
	}

}
