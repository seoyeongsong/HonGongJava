package section04.example01;

public class PrintfExample {

	public static void main(String[] args) {
		// format string ����ϱ�
		int quantity = 123;
		int price = 500;
		// ������ �� ���� ���
		System.out.printf("��ǰ�� ������ : %d ��\n", quantity);
		// ������ ���� ���� ���
		System.out.printf("��ǰ�� ������ : %1$d ��, ��ǰ �ܰ� : %2$d �� \n", quantity, price);

	}

}
