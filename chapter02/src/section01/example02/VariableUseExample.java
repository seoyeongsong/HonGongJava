package section01.example02;

public class VariableUseExample {

	public static void main(String[] args) {
		// ������ ������ �ʱ�ȭ
		int hour = 3;
		int minute = 5;
		
		// ���ڿ��� �Բ� ���
		System.out.println(hour + " �ð� " + minute + " �� ");

		// �� �ð��� �� ������ ��ȯ�Ͽ� ���ο� ������ ��� ����ϱ�
		int totalMinute = (hour*60) + (minute);
		System.out.println("�� " + totalMinute + " �� ");
	}

}
