package section04.example06;

public class CalculatorExample {

	public static void main(String[] args) {
		// ��ü �ܺο��� �޼ҵ� ȣ���ϱ� ���� ��ü���� ����
		Calculator myCalc = new Calculator();
		
		// ���簢�� ���� ���ϱ�
		double result1 = myCalc.areaRectangle(10);
		System.out.println("���簢�� ���� ���ϱ� : " + result1);
		
		// ���簢�� ���� ���ϱ�
		double result2 = myCalc.areaRectangle(10, 5);
		System.out.println("���簢�� ���� ���ϱ� : " + result2);

	}

}
