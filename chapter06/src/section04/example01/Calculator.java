package section04.example01;

public class Calculator {
	
	// ���ϰ��� ���� �޼ҵ��� ��� void �� ����
	void powerOn() {	// �Ű������� ����.
		System.out.println("������ ������ �մϴ�.");
	}
	
	// ���ϱ� ������ ��� �Ű������� ���ϰ��� �����Ѵ�.
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// ������ ����
	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}
	
	void powerOff() {
		System.out.println("������ ������ ���ϴ�.");
	}
}
