package section01.example03;

public class VariableExchangeExample {
	public static void main(String[] args) {
		// 
		int x = 3;
		int y = 5;
		
		System.out.println("x : " + x + ", y : " + y);
		
		// �� ������ ���� ��ȯ�ϱ� ���� �߰��� temp������ �����Ѵ�.
		
		// temp�� x���� ����
		int temp = x;
		// x�� y���� ����
		x = y;
		// y�� temp�� ���� ����(���� x��)
		y = temp;
		
		// ��°��, x�� y���� ���� �ٲ������ Ȯ���� �� �ִ�.
		System.out.println("x : " + x + ", y : " + y);
	}

}
