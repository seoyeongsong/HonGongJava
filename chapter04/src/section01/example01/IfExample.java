package section01.example01;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		// ������ 90�� �̻�(true)�� ��� if�� �� ����
		if(score >=90) {
			System.out.println("������ 90�� ���� �����ϴ�.");
			System.out.println("����� A�Դϴ�");
		}

		// ������ 90�� �̸�(true)�� ��� if�� �� ����
		if(score < 90) {
			System.out.println("������ 90�� ���� �����ϴ�.");
			System.out.println("����� B�Դϴ�.");
		}
	}

}
