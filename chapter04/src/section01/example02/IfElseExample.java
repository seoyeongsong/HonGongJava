package section01.example02;

public class IfElseExample {

	public static void main(String[] args) {

		int score = 85;
		
		// ������ 90 �̻�(true)�� ��, if�� �� ����
		if(score >= 90) {
			System.out.println("������ 90�� �̻��Դϴ�.");
			System.out.println("����� A�Դϴ�.");
		}else {	// ������ 90�� �̸�(false)�� ��, else�� �� ����
			System.out.println("������ 90�� �̸��Դϴ�.");
			System.out.println("����� B�Դϴ�.");
		}

	}

}
